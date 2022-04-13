package chainResponsability;
//handler
public abstract class AbstractOrderProcessor {
    public static int reject = 1;
    public static int proces = 2;
    public static int accept = 3;

    protected int step;

    protected AbstractOrderProcessor nextProcesor;

    public void setNextProcessor(AbstractOrderProcessor nextOrder){
        this.nextProcesor = nextOrder;
    }

    public  void processOrder(Order order){
        if(this.step == order.getStatus()){

            writeOrderStatus(order);
        }
        else if(nextProcesor !=null){
            nextProcesor.processOrder(order);
        }
    }

   abstract protected void writeOrderStatus(Order order);
}
