package goods;

import module10.MedicalProducts;

public class MedicalProduct extends MedicalProducts
{
    public static String name = "Packet Of Headache Pills";
    public static double price = 9.75d;

    public MedicalProduct(double tax)
    {
        super(tax);
    }

}
