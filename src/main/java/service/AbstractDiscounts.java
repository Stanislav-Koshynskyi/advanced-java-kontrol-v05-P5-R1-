package service;


import entity.Order;

import java.math.BigDecimal;

public abstract class AbstractDiscounts {
    private double interestRate;
    public abstract boolean isWorking(BigDecimal amount);
    public double getInterestRate() {
        return interestRate;
    }
}
