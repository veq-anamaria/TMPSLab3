package mediator;

public class Main {
    public static void main(String[] args) {
        Traveler traveler1 = new Traveler("Catalin");
        Traveler traveler2 = new Traveler("Daniela");

        traveler1.sendMessage("Vienna");
        traveler2.sendMessage("Paris");
    }
}
