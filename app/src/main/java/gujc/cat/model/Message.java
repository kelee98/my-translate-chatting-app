package gujc.cat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Message {
    private String uid;
    private String msg;
    private Date timestamp;
    private List<String> readUsers = new ArrayList<>();

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public List<String> getReadUsers() {
        return readUsers;
    }

    public void setReadUsers(List<String> readUsers) {
        this.readUsers = readUsers;
    }

}
