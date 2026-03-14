package entity;

import lombok.Getter;

@Getter
public class OrderItem {
    private Money money;
    private String item;
    public OrderItem(Money money, String item) {
        setMoney(money);
        setItem(item);
    }
    public void  setMoney(Money money) {
        if(money == null){
            throw new IllegalArgumentException("Money is null");
        }
        this.money = money;
    }
    public void setItem(String item) {
        if(money == null){
            throw new IllegalArgumentException("Money is null");
        }
        this.item = item;
    }
    public String toString(){
        return money.toString() + " " + item;
    }
    public boolean Equal(OrderItem o){
        return money.equals(o.money) && item.equals(o.item);
    }
    public int hashCode(){
        return money.hashCode() + item.hashCode();
    }
}
