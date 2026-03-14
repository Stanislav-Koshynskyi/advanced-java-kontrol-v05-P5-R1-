package service;

import entity.Order;
import exception.AmountException;

import java.math.BigDecimal;

public interface PaymentMethod {
    BigDecimal getAmount(Order order) throws AmountException;
}
