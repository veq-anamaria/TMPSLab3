package iterator;
//client
public class Main {
    public static void main(String[] args) {
        MailRepository mailRepository = new MailRepository();
        System.out.println("List of email ");

        for(Folowing item = mailRepository.getFolowing(); item.theNext();){
            String name = (String)item.next();
            System.out.println("Email : " + name);
        }
    }
}
