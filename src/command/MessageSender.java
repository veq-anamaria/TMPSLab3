package command;
/* command receiver */
public class MessageSender {
    private String name = "Cristian";
    private String number = "+373 789 515 29";

    public void mms(){

        System.out.println("Phone[ Name: "+name+", number: " + number +" ] send MMS");
    }
    public void sms(){
        System.out.println("Phone[ Name: "+name+", number: " + number +" ] send SMS");
    }
}
