package goods;

import module10.Goods;

public class BottleOfPerfume1899 extends Goods
{
    public static String name = "$18.99 Bottle Of Perfume";
    public static double price = 18.99d;
    public static boolean isImport = false;

    public BottleOfPerfume1899(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
