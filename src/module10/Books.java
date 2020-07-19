package module10;

public abstract class Books extends Goods
{
    public static double tax = 0.0d;

    public Books(double tax)
    {
        super(tax);
        this.setTax(Books.tax);
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
