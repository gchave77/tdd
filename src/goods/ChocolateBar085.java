package goods;

import module10.Food;

public class ChocolateBar085 extends Food
{
    public static String name = "Non Imported Chocolate Bar";
    public static double price = 0.85d;
    public static boolean isImport = false;

    public ChocolateBar085(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
