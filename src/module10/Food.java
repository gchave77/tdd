package module10;

abstract class Food extends Goods
{
    public Food(double tax)
    {
        super(tax);
        this.setTax(0);
    }

}
