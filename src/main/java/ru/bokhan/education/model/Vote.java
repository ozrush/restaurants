package ru.bokhan.education.model;

import java.time.LocalDate;

public class Vote extends AbstractBaseEntity {

private User user;
private LocalDate created;
private Restaurant restaurant;

    public Vote(Integer id, User user, LocalDate created, Restaurant restaurant) {
        super(id);
        this.user = user;
        this.created = created;
        this.restaurant = restaurant;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
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
                ", date=" + created +
                '}';
    }
}
