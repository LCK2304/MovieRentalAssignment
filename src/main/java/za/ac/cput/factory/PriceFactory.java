package za.ac.cput.factory;

/*
    PriceFactory.java
    Factory class for the Price entity
    @author:219169640 - Casey Michael Keven Crafford
    Assignment 3 – Domain Driven Design: Entity and Factory
    11 June 2021
*/

import za.ac.cput.entity.Price;

public class PriceFactory {

    public static Price build(int price){

        if (price==0)
            return null;

        return new Price.PriceBuilder().setAmount(price).build();
    }
}
