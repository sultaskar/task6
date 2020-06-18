package ru.sultanov.purchase;

public class Purchase {
    private Goods[] goods;

    public Purchase() {
        goods = new Goods[2];
        goods[0] = new Apple(14);
        goods[1] = new Pizza(3);
    }

    public double getPrice() { //Определение стоимости всех продуктов в массиве
        double sum = 0.0;
        for (Goods g : goods) {
            sum += g.getCost();
        }
        return sum;
    }
}
