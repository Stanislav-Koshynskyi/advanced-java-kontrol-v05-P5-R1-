package service;
import entity.Order;
import entity.OrderItem;
import exception.AmountException;

import java.math.BigDecimal;

public class CardPayment extends PaymentAbstact {
    @Override
    public BigDecimal getSum(Order order) throws AmountException {
        BigDecimal amount = BigDecimal.ZERO;
        for (OrderItem item: order.getOrderItems()){
            amount.add(item.getMoney().getMoney());
        }
        if (amount.compareTo(BigDecimal.valueOf(40000)) > 0) {
            throw new AmountException("amount exceed 40000");
        }
        return amount;
    }


    @Override
    public BigDecimal getAmount(Order order) throws AmountException {
        return null;
    }
}
