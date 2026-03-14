package entity;

import lombok.Getter;

public class Order {
    private final OrderItem[] orderItems;
    @Getter
    private Email email;
    public OrderItem[] getOrderItems() {
        return orderItems.clone();
    }
    public void setEmail(Email email) {
        if (email == null) {
            throw new IllegalArgumentException("email is null");
        }
        this.email = email;
    }
    public Order(Email email, OrderItem[] orderItems) {
        setEmail(email);
        if (orderItems == null) {
            throw new IllegalArgumentException("orderItems is null");
        }
        this.orderItems = orderItems.clone();
    }
}
