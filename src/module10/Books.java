package module10;

public abstract class Books extends Goods
{
    public static double tax = 0.0d;

    public Books(double tax)
    {
        super(tax);
        this.setTax(Books.tax);
    }

}
