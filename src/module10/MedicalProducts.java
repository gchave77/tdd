package module10;

public abstract class MedicalProducts extends Goods
{
    public MedicalProducts(double tax)
    {
        super(tax);
        this.setTax(0);
    }
}
