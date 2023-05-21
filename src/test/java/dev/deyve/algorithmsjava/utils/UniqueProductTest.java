package dev.deyve.algorithmsjava.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniqueProductTest {

    @Test
    @DisplayName("First Unique Product - One")
    void firstUniqueProductOne() {
        String[] strings = {"Apple"};

        String result = UniqueProduct.firstUniqueProduct(strings);

        assertEquals("Apple", result);
    }

    @Test
    @DisplayName("First Unique Product - Two")
    void firstUniqueProductTwo() {
        String[] strings = {"Apple", "Computer"};

        String result = UniqueProduct.firstUniqueProduct(strings);

        assertEquals("Apple", result);
    }

    @Test
    @DisplayName("First Unique Product - Three")
    void firstUniqueProductThree() {
        String[] strings = {"Apple", "Computer", "Computer"};

        String result = UniqueProduct.firstUniqueProduct(strings);

        assertEquals("Apple", result);
    }

    @Test
    @DisplayName("First Unique Product - Four")
    void firstUniqueProductFour() {
        String[] strings = {"Apple", "Computer", "Computer", "Bag"};

        String result = UniqueProduct.firstUniqueProduct(strings);

        assertEquals("Apple", result);
    }

    @Test
    @DisplayName("First Unique Product - Five")
    void firstUniqueProduct() {
        String[] strings = {"Apple", "Computer","Computer", "Apple", "Bag"};

        String result = UniqueProduct.firstUniqueProduct(strings);

        assertEquals("Bag", result);
    }
}