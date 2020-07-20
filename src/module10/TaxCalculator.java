package module10;

public class TaxCalculator
{
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
