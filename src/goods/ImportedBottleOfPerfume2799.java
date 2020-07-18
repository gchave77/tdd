package goods;

import module10.Goods;
import module10.Imports;

public class ImportedBottleOfPerfume2799 extends Goods implements Imports
{
    String name = "Imported Bottle Of Perfume $27.99";
    double price = 27.99;
    private final double importTax;

    public ImportedBottleOfPerfume2799(double tax, String name, double price, double importTax)
    {
        super(tax);
        this.name = name;
        this.price = price;
        this.importTax = importTax;
    }

    public double getImportTax()
    {
        return importTax;
    }
}
