package goods;

import module10.MedicalProducts;

public class PacketOfHeadachePills975 extends MedicalProducts
{
    public static String name = "$9.75 Packet Of Headache Pills";
    public static double price = 9.75;

    public PacketOfHeadachePills975(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax;

        totalItemTax = tax * price;
        return totalItemTax;
    }

}
