package goods;

import module10.Goods;
import module10.Imports;

public class BottleOfImportedPerfume extends Goods implements Imports
{
    public static String name = "Bottle Of Imported Perfume";
    public static double price = 27.99d;
    public static boolean isImport = true;

    public BottleOfImportedPerfume(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
