package ru.sultanov.purchase;

public class Goods {
    protected double cost;
    int amount;

    public Goods(int amount) { // Конструктор с внешним параметром количества
        this.amount = amount;
    }

    double getCost() { //Определение стоимости одной позиции
        return cost * amount;
    }

}
