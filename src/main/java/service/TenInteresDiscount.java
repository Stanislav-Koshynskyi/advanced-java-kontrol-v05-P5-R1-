package service;

import entity.Order;

import java.math.BigDecimal;

public class TenInteresDiscount extends AbstractDiscounts {
    @Override
    public boolean isWorking(BigDecimal amount) {
        return (amount.compareTo(BigDecimal.valueOf(10000)) >= 0);
    }
}
