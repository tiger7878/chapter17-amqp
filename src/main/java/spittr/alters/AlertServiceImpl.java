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
        rabbitTemplate.convertAndSend("spittle.alert.exchange","spittle.alerts",spittle);
    }

    @Override
    public Spittle receiveSpittleAlert() {
        return null;
    }

}
