package goods;

import module10.Foods;

public class ImportedBoxOfChocolates extends Foods
{
    public static String name = "Imported Box Of Chocolates";
    public static double price = 10.00d;
    public static boolean isImport = true;

    public ImportedBoxOfChocolates(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
