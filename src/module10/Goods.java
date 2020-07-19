package module10;

public class Goods
{
    public static double tax = 0.1d;

    public Goods(double tax)
    {
    }

    public double getTax()
    {
        return tax;
    }

    public void setTax(double tax) { }

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
