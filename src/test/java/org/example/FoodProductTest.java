package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodProductTest {

    @Test
    void foodProductHasNameAndPrice() {

        FoodProduct foodProduct = new FoodProduct("name", 3.50);


        foodProduct.getPrice();

        assertEquals("name", foodProduct.getName());

    }

@Test

    void whenAddDiscount_ThenPriceisDiscounted (){
    FoodProduct foodProduct = new FoodProduct("name", 10);

    foodProduct.applyDiscount(20);
    assertEquals(8,foodProduct.getPrice());

}
}