package Goods;

import module10.Goods;

public class BottleOfPerfume1899 extends Goods
{
    String name = "Bottle Of Perfume $18.99";
    double price = 18.99;


    public BottleOfPerfume1899(double tax, String name, double price)
    {
        super(tax);
        this.name = name;
        this.price = price;
    }
}
