package module10;

abstract class Books extends Goods
{
    public Books(double tax)
    {
        super(tax);
        this.setTax(0);
    }
}
