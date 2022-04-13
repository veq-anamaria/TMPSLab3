package command;

public class Main {
    public static void main(String[] args) {
        MessageSender messageSender = new MessageSender();

        SendMMS sendMMSOrder = new SendMMS(messageSender);
        SendSMS sendSMSOrder = new SendSMS(messageSender);

        Invoker comand = new Invoker();
        comand.takeOperations(sendMMSOrder);
        comand.takeOperations(sendSMSOrder);

        comand.sendMessages();
    }
}
