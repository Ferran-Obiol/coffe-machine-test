package io.rviewer.makedrinks;

import java.math.BigDecimal;

public enum Drink {

    COFFEE("coffee", BigDecimal.valueOf(0.5)),
    CHOCOLATE("chocolate",BigDecimal.valueOf(0.6)),
    TEA("tea", BigDecimal.valueOf(0.4));

    private final BigDecimal price;
    private final String name;

    Drink(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
