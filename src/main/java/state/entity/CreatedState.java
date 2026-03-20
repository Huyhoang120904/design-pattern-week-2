package state.entity;

public class CreatedState implements IOrderState{

    @Override
    public void process(Order order) {
        System.out.println("Order has just been created");
        order.setOrderState(new ProcessingState());
    }
}
