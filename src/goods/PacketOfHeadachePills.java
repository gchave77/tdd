package goods;

import module10.MedicalProducts;

public class PacketOfHeadachePills extends MedicalProducts
{
    public static String name = "Packet Of Headache Pills";
    public static double price = 9.75d;

    public PacketOfHeadachePills(double tax)
    {
        super(tax);
    }

}
