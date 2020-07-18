package Goods;

import module10.Goods;
import module10.Imports;

public class ImportedBottleOfPerfume4750 extends Goods implements Imports
{
    String name = "Imported Bottle Of Perfume $47.50";
    double price = 47.50;
    private final double importTax;

    public ImportedBottleOfPerfume4750(double tax, String name, double price, double importTax)
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
