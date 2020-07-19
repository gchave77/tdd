package goods;

import module10.Goods;

public class MusicCD1499 extends Goods
{
    public static String name = "Non Imported Music CD";
    public static double price = 14.99d;

    public MusicCD1499(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax = tax * price;
        return Math.round(totalItemTax * 20.0) / 20.0;
    }
}
