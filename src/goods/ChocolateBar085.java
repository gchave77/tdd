package goods;

import module10.Food;

public class ChocolateBar085 extends Food
{
    public static String name = "Non Imported Chocolate Bar";
    public static double price = 0.85;

    public ChocolateBar085(double tax, String name, double price)
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
