package goods;

import module10.Food;
import module10.Imports;

public class ImportedBoxOfChocolates1000 extends Food implements Imports
{
    public static String name = "$10 Imported Box Of Chocolates";
    public static double price = 10.00;

    public ImportedBoxOfChocolates1000(double tax, String name, double price)
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
