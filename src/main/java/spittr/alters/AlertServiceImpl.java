package spittr.alters;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import spittr.domain.Spittle;

/**
 * User: monkey
 * Date: 2018-06-08 10:06
 */
public class AlertServiceImpl implements AlertService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendSpittleAlert(Spittle spittle) {
        //发送消息
        rabbitTemplate.convertAndSend("spittle.alert.exchange","spittle.alerts",spittle);
    }

    @Override
    public Spittle receiveSpittleAlert() {
        //同步接收消息
        return (Spittle) rabbitTemplate.receiveAndConvert("spittle.alerts");
    }

}
