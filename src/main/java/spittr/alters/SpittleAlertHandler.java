package spittr.alters;

import spittr.domain.Spittle;

/**
 * 消息驱动POJO
 * @author: monkey
 * @date: 2018/6/9 16:28
 */
public class SpittleAlertHandler {

    public void handleSpittleAlert(Spittle spittle){
        System.out.println("处理消息："+spittle.getMessage());
    }

}
