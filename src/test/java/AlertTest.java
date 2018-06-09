import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import spittr.alters.AlertService;
import spittr.domain.Spittle;

import java.util.Date;

/**
 * User: monkey
 * Date: 2018-06-08 10:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:amqp-producer.xml")
public class AlertTest {

    @Autowired
    private AlertService alertService;

    //测试发送消息
    @Test
    public void sendSpittleAlert(){
        Spittle spittle = new Spittle(1L, "a", new Date());
        alertService.sendSpittleAlert(spittle);
    }

    //测试接收消息
    @Test
    public void receiveSpittleAlert(){
        Spittle spittle = alertService.receiveSpittleAlert();
        System.out.println(spittle.getMessage());
    }

}
