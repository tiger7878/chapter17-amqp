package spittr.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * User: monkey
 * Date: 2018-06-08 9:54
 */
public class Spittle implements Serializable{

    private final Long id;
    private final String message;
    private final Date postedTime;

    public Spittle(Long id, String message, Date postedTime) {
        this.id = id;
        this.message = message;
        this.postedTime = postedTime;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getPostedTime() {
        return postedTime;
    }
}
