package ru.sultanov;

import ru.sultanov.purchase.Purchase;

public class Run {
    public static void main(String[] args) {

        Purchase purchase = new Purchase();
        System.out.println("Total price = " + purchase.getPrice()); // Общая стоимость покупки

    }
}
