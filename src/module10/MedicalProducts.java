package module10;

public abstract class MedicalProducts extends Goods
{
    public static double tax = 0.0d;

    public MedicalProducts(double tax)
    {
        super(tax);
        this.setTax(MedicalProducts.tax);
    }

}
