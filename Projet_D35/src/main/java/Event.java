import java.util.Date;

/**
 * Created by tomtom on 26/10/17.
 */
public class Event {
    private int id;
    private String title;
    private String message;
    private Date date;
    private String location;
    private String type;

    public Event(int id, String title, String message, Date date, String location, String type) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.date = date;
        this.location = location;
        this.type = type;
    }

    public Event() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
