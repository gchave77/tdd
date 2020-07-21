package module10;

public abstract class Food extends Good
{
    public static double tax = 0.0d;

    public Food(double tax)
    {
        super(tax);
        this.setTax(Food.tax);
    }

}
