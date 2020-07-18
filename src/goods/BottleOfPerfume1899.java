package goods;

import module10.Goods;

public class BottleOfPerfume1899 extends Goods
{
    public static String name = "$18.99 Bottle Of Perfume";
    public static double price = 18.99;

    public BottleOfPerfume1899(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax;

        totalItemTax = tax * price;
        return totalItemTax;
    }
}
