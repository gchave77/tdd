package module10;

public abstract class Food extends Goods
{
    public static double tax = 0;

    public Food(double tax)
    {
        super(tax);
        this.setTax(Food.tax);
    }

}
