package entity;

import lombok.Getter;

@Getter
public class OrderItem {
    private Money money;
    private String item;
    public OrderItem(Money money, String item) {
        setMoney();
        setItem();
    }
    public void  setMoney(Money money) {
        if(money == null){
            throw new IllegalArgumentException("Money is null");
        }
        this.money = money;
    }
    public void setItem() {
        if(money == null){
            throw new IllegalArgumentException("Money is null");
        }
        this.item = item;
    }
}
