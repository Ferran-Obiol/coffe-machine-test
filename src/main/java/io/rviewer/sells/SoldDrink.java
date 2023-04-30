package io.rviewer.sells;


import java.io.Serializable;
import java.math.BigDecimal;

public class SoldDrink {

    private String drinkName;
    private BigDecimal money;

    public SoldDrink(String drinkName, BigDecimal money) {
        this.drinkName = drinkName;
        this.money = money;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "SoldDrink{" +
                "drinkName='" + drinkName + '\'' +
                ", money=" + money +
                '}';
    }
}
