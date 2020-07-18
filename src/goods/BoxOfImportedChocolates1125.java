package goods;

import module10.Food;
import module10.Imports;

public class BoxOfImportedChocolates1125 extends Food implements Imports
{
    public static String name = "$11.25 Box Of Imported Chocolates";
    public static double price = 11.25;

    public BoxOfImportedChocolates1125(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax;

        totalItemTax = (tax + Imports.importTax) * price;
        return totalItemTax;
    }

}
