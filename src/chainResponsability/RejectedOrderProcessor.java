package chainResponsability;
//concret handler
public class RejectedOrderProcessor extends AbstractOrderProcessor {

    public RejectedOrderProcessor(int step){
        this.step = step;
    }

    @Override
    protected void writeOrderStatus(Order order) {
        System.out.println("Status: respins");
    }
}
