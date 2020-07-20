package goods;

import module10.Goods;

public class MusicCD extends Goods
{
    public static String name = "Music CD";
    public static double price = 14.99d;

    public MusicCD(double tax)
    {
        super(tax);
    }

}
