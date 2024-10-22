package events;
import java.io.File;

public class SMSSupportListener implements EventListener {
    private String phoneNo;
    private String message;

    public SMSSupportListener(String phoneNo, String message) {
        this.phoneNo = phoneNo;
        this.setMessage(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        if (message.length() > 160) {
            System.out.print("Message is to long, Message not set");
            return;
        }
        this.message = message;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("SMS to " + phoneNo + "Message: " + this.message);
    }
}