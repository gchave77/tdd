package goods;

import module10.Goods;

public class Good extends Goods
{
    public static String nameMusicCD = "Music CD";
    public static double priceMusicCD = 14.99d;

    public static String nameBottleOfImportedPerfume = "Bottle Of Imported Perfume";
    public static double priceBottleOfImportedPerfume = 27.99d;

    public static String nameBottleOfPerfume = "Bottle Of Perfume";
    public static double priceBottleOfPerfume = 18.99d;

    public static String nameImportedBottleOfPerfume = "Imported Bottle Of Perfume";
    public static double priceImportedBottleOfPerfume = 47.50d;

    public Good(double tax)
    {
        super(tax);
    }

}
