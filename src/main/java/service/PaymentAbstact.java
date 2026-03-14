package service;

import com.sun.org.apache.xpath.internal.operations.Or;
import entity.Order;
import exception.AmountException;

import java.math.BigDecimal;
import java.util.List;

public abstract class PaymentAbstact implements PaymentMethod {


    public final BigDecimal getAmount(Order order, List<AbstractDiscounts> discounts) throws AmountException {
        BigDecimal amount = BigDecimal.ZERO;
        amount = getSum(order);
        amount = checkDiscount(amount, discounts);
        return amount;
    }
    abstract BigDecimal getSum(Order order) throws AmountException;
    private BigDecimal checkDiscount(BigDecimal amount, List<AbstractDiscounts> discounts) {
        for (AbstractDiscounts discount : discounts) {
            if (discount.isWorking(amount)) {
                amount = amount.multiply(BigDecimal.valueOf(discount.getInterestRate()));
            }
        }
    }
}
