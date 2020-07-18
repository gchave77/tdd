package module10;

abstract class MedicalProducts extends Goods
{
    public MedicalProducts(double tax)
    {
        super(tax);
        this.setTax(0);
    }
}
