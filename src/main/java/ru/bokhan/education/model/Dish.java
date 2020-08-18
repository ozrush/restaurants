package ru.bokhan.education.model;

import java.time.LocalDate;

public class Dish extends AbstractNamedEntity {

    private Float price;
    private Integer restaurantId;
    private LocalDate date;

    public Dish(Integer id, String name, Float price) {
        super(id, name);
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                '}';
    }
}
