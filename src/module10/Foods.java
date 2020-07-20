package module10;

public abstract class Foods extends Goods
{
    public static double tax = 0.0d;

    public Foods(double tax)
    {
        super(tax);
        this.setTax(Foods.tax);
    }

}
