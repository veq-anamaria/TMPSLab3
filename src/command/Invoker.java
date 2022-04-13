package command;
//invoker
import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<SendMessage> sendMessageList = new ArrayList<SendMessage>();

    public void takeOperations(SendMessage sendMessage){
        sendMessageList.add(sendMessage);
    }

    public void sendMessages(){

        for (SendMessage sendMessage : sendMessageList) {
            sendMessage.execute();
        }
        sendMessageList.clear();
    }
}
