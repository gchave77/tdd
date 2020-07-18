package module10;

public class Goods
{
    public static double tax = 0.1;

    public Goods(double tax)
    {
        this.tax = tax;
    }

    public double getTax()
    {
        return tax;
    }

    public void setTax(double tax)
    {
        this.tax = tax;
    }
}
