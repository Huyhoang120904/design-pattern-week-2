package state.entity;

public class DeliveredState implements IOrderState{

    @Override
    public void process(Order order) {
        System.out.println("Order has been deliver");
        order.setOrderState(new CancelledState());
    }
}
