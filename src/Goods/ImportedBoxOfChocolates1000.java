package Goods;

import module10.Food;
import module10.Imports;

public class ImportedBoxOfChocolates1000 extends Food implements Imports
{
    String name = "Imported Box Of Chocolates $10.00";
    double price = 10.00;
    private final double importTax;

    public ImportedBoxOfChocolates1000(double tax, String name, double price, double importTax)
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
