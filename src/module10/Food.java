package module10;

public abstract class Food extends Goods
{
    public static double tax = 0.00d;

    public Food(double tax)
    {
        super(tax);
        this.setTax(Food.tax);
    }

    public static double calcTax(double tax, double price, boolean isImport)
    {
        double totalItemTax;

        if (isImport) {
            totalItemTax = (tax + Imports.IMPORT_TAX) * price;
        } else {
            totalItemTax = tax * price;
        }
        return Math.round(totalItemTax * 20.0) / 20.0;
    }

}
