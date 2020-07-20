package goods;

import module10.Goods;

public class ImportedBottleOfPerfume extends Goods
{
    public static String name = "Imported Bottle Of Perfume";
    public static double price = 47.50d;
    public static boolean isImport = true;

    public ImportedBottleOfPerfume(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
