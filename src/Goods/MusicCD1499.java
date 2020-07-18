package Goods;

import module10.Goods;

public class MusicCD1499 extends Goods
{
    String name = "Music CD $14.99";
    double price = 14.99;

    public MusicCD1499(double tax, String name, double price)
    {
        super(tax);
        this.name = name;
        this.price = price;
    }
}
