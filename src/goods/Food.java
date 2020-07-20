package goods;

import module10.Foods;

import javax.swing.*;

public class Food extends Foods
{
    public static String nameBoxOfImportedChocolates = "Box Of Imported Chocolates";
    public static double priceBoxOfImportedChocolates = 11.25d;

    public static String nameChocolateBar = "Chocolate Bar";
    public static double priceChocolateBar = 0.85d;

    public static String nameImportedBoxOfChocolates = "Imported Box Of Chocolates";
    public static double priceImportedBoxOfChocolates = 10.00d;

    public Food(double tax)
    {
        super(tax);
    }

}
