package ru.sultanov.purchase;

public class Good {
    protected double cost;
    int amount;

    public Good(int amount) { // Конструктор с внешним параметром количества
        this.amount = amount;
    }

    double getCost() { //Определение стоимости одной позиции
        return cost * amount;
    }

}
