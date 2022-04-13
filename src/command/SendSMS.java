package command;
// concret command
public class SendSMS implements SendMessage {
    private MessageSender messageSender;

    public SendSMS(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public void execute() {
        messageSender.sms();
    }

}
