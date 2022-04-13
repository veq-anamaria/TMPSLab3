package chainResponsability;
//concret handler
public class AcceptedOrderProcessor extends AbstractOrderProcessor {
    public AcceptedOrderProcessor(int step){
        this.step = step;
    }

    @Override
    protected void writeOrderStatus(Order order) {
        System.out.println("Status: acceptat "+order.getPrice());
    }
}
