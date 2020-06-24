package ru.sultanov.purchase;

public class Purchase {
    private Good[] goods;

    public Purchase(int apples, int pizzas) { // Метод покупки с количеством яблок и пицц
        goods = new Good[2];
        goods[0] = new Apple(apples);
        goods[1] = new Pizza(pizzas);
    }

    public double getPrice() { //Определение стоимости всех продуктов в массиве
        double sum = 0.0;
        for (Good g : goods) {
            sum += g.getCost();
        }
        return sum;
    }
}
