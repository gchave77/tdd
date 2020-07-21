package module10;

public abstract class MedicalProduct extends Good
{
    public static double tax = 0.0d;

    public MedicalProduct(double tax)
    {
        super(tax);
        this.setTax(MedicalProduct.tax);
    }

}
