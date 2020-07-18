package module10;

public abstract class Food extends Goods
{
    public Food(double tax)
    {
        super(tax);
        this.setTax(0);
    }

}
