package goods;

import module10.Goods;
import module10.Imports;

public class ImportedBottleOfPerfume2799 extends Goods implements Imports
{
    public static String name = "$27.99 Imported Bottle Of Perfume";
    public static double price = 27.99d;
    public static boolean isImport = true;

    public ImportedBottleOfPerfume2799(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
