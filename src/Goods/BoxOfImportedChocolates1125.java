package Goods;

import module10.Food;
import module10.Imports;

public class BoxOfImportedChocolates1125 extends Food implements Imports
{
    String name = "Box Of Imported Chocolates $11.25";
    double price = 11.25;
    private final double importTax;


    public BoxOfImportedChocolates1125(double tax, String name, double price, double importTax)
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
