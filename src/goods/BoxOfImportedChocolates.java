package goods;

import module10.Foods;

public class BoxOfImportedChocolates extends Foods
{
    public static String name = "Box Of Imported Chocolates";
    public static double price = 11.25d;
    public static boolean isImport = true;

    public BoxOfImportedChocolates(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
