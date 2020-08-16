package ru.bokhan.education.model;

import java.time.LocalDate;

public class Vote extends AbstractBaseEntity {

private User user;
private LocalDate date;
private Restaurant restaurant;

    public Vote(Integer id, User user, LocalDate date, Restaurant restaurant) {
        super(id);
        this.user = user;
        this.date = date;
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", user=" + user.getName()+
                ", restaurant=" + restaurant.getName() +
                ", date=" + date +
                '}';
    }
}
