package chainResponsability;
//base handler
public class Order {
   private int status;
   private String cod;
   private double price;

    public Order(int status, String cod, double price) {
        this.status = status;
        this.cod = cod;
        this.price = price;
    }

    public int getStatus() {
        return status;
    }

    public String getCod() {
        return cod;
    }

    public double getPrice() {
        return price;
    }
}
