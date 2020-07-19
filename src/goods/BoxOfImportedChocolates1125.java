package goods;

import module10.Food;
import module10.Imports;

public class BoxOfImportedChocolates1125 extends Food implements Imports
{
    public static String name = "$11.25 Box Of Imported Chocolates";
    public static double price = 11.25d;
    public static boolean isImport = true;

    public BoxOfImportedChocolates1125(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
