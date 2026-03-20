package state.entity;

public class CancelledState implements IOrderState{

    @Override
    public void process(Order order) {
        System.out.println("Order has been cancelled");
    }
}
