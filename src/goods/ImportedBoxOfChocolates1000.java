package goods;

import module10.Food;
import module10.Imports;

public class ImportedBoxOfChocolates1000 extends Food implements Imports
{
    public static String name = "$10 Imported Box Of Chocolates";
    public static double price = 10.00d;
    public static boolean isImport = true;

    public ImportedBoxOfChocolates1000(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
