package goods;

import module10.Goods;

public class MusicCD extends Goods
{
    public static String name = "Music CD";
    public static double price = 14.99d;
    public static boolean isImport = false;

    public MusicCD(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
