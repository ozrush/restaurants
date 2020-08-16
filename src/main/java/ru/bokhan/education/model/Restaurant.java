package ru.bokhan.education.model;

public class Restaurant extends AbstractNamedEntity {
    private Menu menu;

    public Restaurant(Integer id, String name, Menu menu) {
        super(id, name);
        this.menu = menu;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name=" + name +
                ", menu=" + menu +
                '}';
    }
}