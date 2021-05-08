package Day13;

import javax.xml.crypto.Data;
import java.util.Date;

public class Message {
    private User sender;
    private User reciver;
    private String text;
    private Date date;

    public Message(User sender, User reciver, String text) {
        this.sender = sender;
        this.reciver = reciver;
        this.text = text;
        this.date = new Date();

    }

    public User getSender() {
        return sender;
    }

    public User getReciver() {
        return reciver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    public String toString(){
        return "FROM: " + this.sender+ "\nTO"
 + reciver + "\nON: " + date + "\n" + text + "\n";

    }


}
