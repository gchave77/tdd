package goods;

import module10.Food;

public class Foods extends Food
{
    public static String nameBoxOfImportedChocolates = "Box Of Imported Chocolates";
    public static double priceBoxOfImportedChocolates = 11.25d;

    public static String nameChocolateBar = "Chocolate Bar";
    public static double priceChocolateBar = 0.85d;

    public static String nameImportedBoxOfChocolates = "Imported Box Of Chocolates";
    public static double priceImportedBoxOfChocolates = 10.00d;

    public Foods(double tax)
    {
        super(tax);
    }

}
