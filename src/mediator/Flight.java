package mediator;
//mediator
import java.util.Date;

public class Flight {
    public static void showMessage(Traveler traveler, String message) {
        System.out.println("The flight is on: "+new Date().toString() + " [" + traveler.getName() + "] : " + message);
    }
}
