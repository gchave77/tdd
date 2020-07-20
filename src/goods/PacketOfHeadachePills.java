package goods;

import module10.MedicalProducts;

public class PacketOfHeadachePills extends MedicalProducts
{
    public static String name = "Packet Of Headache Pills";
    public static double price = 9.75d;
    public static boolean isImport = false;

    public PacketOfHeadachePills(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
