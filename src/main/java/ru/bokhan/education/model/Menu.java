package ru.bokhan.education.model;

import java.time.LocalDate;
import java.util.List;

public class Menu extends AbstractBaseEntity {
    private Integer restaurantId;
    private LocalDate date;
    private List<Dish> dishList;

    public Menu(Integer id, Integer restaurantId, LocalDate date, List<Dish> dishList) {
        super(id);
        this.restaurantId = restaurantId;
        this.date = date;
        setDishList(dishList);
    }

    public Integer getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(Integer restaurantId) {
        this.restaurantId = restaurantId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public List<Dish> getDishList() {
        return dishList;
    }

    public void setDishList(List<Dish> dishList) {
        this.dishList = dishList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", date=" + date +
                ", restaurantId=" + restaurantId +
                ", dishList=" + dishList +
                '}';
    }
}