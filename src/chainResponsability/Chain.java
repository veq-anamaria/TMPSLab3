package chainResponsability;

public class Chain {
    public static AbstractOrderProcessor getChainOfOrders(){

        AbstractOrderProcessor rejectedOrderProcesor = new RejectedOrderProcessor(AbstractOrderProcessor.reject);
        AbstractOrderProcessor acceptedOrderProcesor = new AcceptedOrderProcessor(AbstractOrderProcessor.accept);
        AbstractOrderProcessor inProcesOrderProcesor = new InProcesOrderProcessor(AbstractOrderProcessor.proces);

        rejectedOrderProcesor.setNextProcessor(inProcesOrderProcesor);
        inProcesOrderProcesor.setNextProcessor(acceptedOrderProcesor);

        return rejectedOrderProcesor;
    }
}
