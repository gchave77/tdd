package goods;

import module10.Foods;

public class ChocolateBar extends Foods
{
    public static String name = "Chocolate Bar";
    public static double price = 0.85d;
    public static boolean isImport = false;

    public ChocolateBar(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
