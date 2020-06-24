package ru.sultanov;

import ru.sultanov.purchase.Purchase;

public class Run {
    public static void main(String[] args) {

        Purchase purchase = new Purchase(3, 5);
        System.out.println("Total price = " + purchase.getPrice()); // Общая стоимость покупки

    }
}
