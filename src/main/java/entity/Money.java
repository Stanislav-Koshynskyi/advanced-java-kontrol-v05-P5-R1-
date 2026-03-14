package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
public class Money {
    private BigDecimal money;
    public Money(BigDecimal money) {
        setMoney(money);
    }
    public void setMoney(BigDecimal money) {
        if (money == null) {
            throw new IllegalArgumentException("Money is null");
        }
        if (money.compareTo(BigDecimal.ZERO) > 0) {
            this.money = money;
        }
        else{
            throw new IllegalArgumentException("Money is negative");
        }
    }
    public int hashCode() {
        int hash = 7;
        return  97 * hash + Objects.hashCode(this.money);
    }
}

