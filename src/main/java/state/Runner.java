package state;

import state.entity.Order;

public class Runner {

    public static void main(String[] args) {
        Order order = new Order();

        order.request();
        order.request();
        order.request();


    }

}
