package service;

import entity.Order;
import entity.OrderItem;
import exception.AmountException;

import java.math.BigDecimal;

public class PayPallPayment extends PaymentAbstact {
    @Override
    public BigDecimal getSum(Order order) throws AmountException {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderItem orderItem : order.getOrderItems()) {
            amount.add(orderItem.getMoney().getMoney());
        }
        if (amount.compareTo(BigDecimal.valueOf(500)) < 0) {
            throw new AmountException("Min amount 500");
        }
        return amount;
    }

    @Override
    public BigDecimal getAmount(Order order) throws AmountException {
        return null;
    }
}
