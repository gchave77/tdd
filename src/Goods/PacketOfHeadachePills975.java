package Goods;

import module10.MedicalProducts;

public class PacketOfHeadachePills975 extends MedicalProducts
{
    String name = "Packet Of Headache Pills $9.75";
    double price = 9.75;

    public PacketOfHeadachePills975(double tax, String name, double price)
    {
        super(tax);
        this.name = name;
        this.price = price;
    }
}
