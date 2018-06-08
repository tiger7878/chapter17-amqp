package spittr.alters;

import spittr.domain.Spittle;

/**
 * User: monkey
 * Date: 2018-06-08 9:56
 */
public interface AlertService {
    void sendSpittleAlert(Spittle spittle);
    Spittle receiveSpittleAlert();
}
