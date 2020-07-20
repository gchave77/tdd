package goods;

import module10.Goods;

public class BottleOfPerfume extends Goods
{
    public static String name = "Bottle Of Perfume";
    public static double price = 18.99d;
    public static boolean isImport = false;

    public BottleOfPerfume(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
