package goods;

import module10.Goods;
import module10.Imports;

public class ImportedBottleOfPerfume2799 extends Goods implements Imports
{
    public static String name = "$27.99 Imported Bottle Of Perfume";
    public static double price = 27.99;

    public ImportedBottleOfPerfume2799(double tax, String name, double price)
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
