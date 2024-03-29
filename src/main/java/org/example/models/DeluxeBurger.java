package org.example.models;

public class DeluxeBurger extends Hamburger {

    //    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
//        super(name, meat, 19.10, breadRollType);
//    }

    public DeluxeBurger() {
        super("Deluxe", "meat", 19.10, "bread");
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Deluxe Burger için yeni malzeme eklenemez.");
    }

    public String getCips() {
        return "CURVY";
    }

    public String getDrink() {
        return "COKE";
    }
}
