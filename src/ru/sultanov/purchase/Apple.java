package ru.sultanov.purchase;

public class Apple extends Good {

    private double appleWeight = 0.18; // Вес яблока

    public Apple(int amount) {
        super(amount);
        super.cost = 105.50; // Стоимость 1 кг яблок
    }

    @Override
    double getCost() {
        return super.amount * appleWeight * cost; // Переопределение стоимости позиции
    }
}

