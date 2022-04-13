package chainResponsability;
//concret handler
public class InProcesOrderProcessor extends AbstractOrderProcessor {

    public InProcesOrderProcessor(int step){
        this.step = step;
    }

    @Override
    protected void writeOrderStatus(Order order) {
        System.out.println("Status: se proceseaza "+order.getCod());
    }
}
