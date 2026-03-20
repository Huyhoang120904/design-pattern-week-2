package state.entity;

public class Order {
    private IOrderState orderState;

    public Order() {
        this.orderState = new CreatedState();
    }

    public void setOrderState(IOrderState orderState) {
        this.orderState = orderState;
    }

    public void request() {
        orderState.process(this);
    }
}
