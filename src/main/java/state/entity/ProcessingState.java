package state.entity;

public class ProcessingState implements IOrderState{

    @Override
    public void process(Order order) {
        System.out.println("Order is processing");
        order.setOrderState(new DeliveredState());
    }
}
