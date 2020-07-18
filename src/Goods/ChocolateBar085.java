package Goods;

import module10.Food;

public class ChocolateBar085 extends Food
{
    String name = "Chocolate Bar $0.85";
    double price = 0.85;

    public ChocolateBar085(double tax, String name, double price)
    {
        super(tax);
        this.name = name;
        this.price = price;
    }
}
