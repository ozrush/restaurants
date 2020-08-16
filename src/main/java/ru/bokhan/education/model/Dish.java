package ru.bokhan.education.model;

public class Dish extends AbstractNamedEntity {

    private Float price;

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
