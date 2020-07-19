package goods;

import module10.Goods;
import module10.Imports;

public class ImportedBottleOfPerfume4750 extends Goods implements Imports
{
    public static String name = "$47.50 Imported Bottle Of Perfume";
    public static double price = 47.50d;

    public ImportedBottleOfPerfume4750(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax;

        totalItemTax = (tax + Imports.IMPORT_TAX) * price;
        return Math.round(totalItemTax * 20.0) / 20.0;
    }
}
