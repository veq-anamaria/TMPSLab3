package mediator;
//component
public class Traveler {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Traveler(String name){
        this.name  = name;
    }

    public void sendMessage(String message){
        Flight.showMessage(this,message);
    }
}
