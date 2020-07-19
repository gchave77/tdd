package goods;

import module10.Goods;

public class MusicCD1499 extends Goods
{
    public static String name = "Non Imported Music CD";
    public static double price = 14.99d;
    public static boolean isImport = false;

    public MusicCD1499(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
