package chainResponsability;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Order> orderList= new ArrayList<>();
        orderList.add(new Order(AbstractOrderProcessor.accept, "MK105", 452));
        orderList.add(new Order(AbstractOrderProcessor.reject, "DB895", 5896));
        orderList.add(new Order(AbstractOrderProcessor.accept, "OP785", 1000));
        orderList.add(new Order(AbstractOrderProcessor.proces, "JU805", 7552));

        AbstractOrderProcessor orderChain = Chain.getChainOfOrders();
        for(Order order:orderList){
            orderChain.processOrder(order);

        }

    }

}
