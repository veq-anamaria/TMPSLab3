package command;
//concret command
public class SendMMS implements SendMessage {
    private MessageSender messageSender;

    public SendMMS(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void execute() {
        messageSender.mms();
    }
}
