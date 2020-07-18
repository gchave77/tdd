package goods;

import module10.Books;

public class Book1249 extends Books
{
    public static String name = "Non Imported Book";
    public static double price = 12.49;

    public Book1249(double tax, String name, double price)
    {
        super(tax);
    }

    public static double getPurchase(double tax, double price)
    {
        double totalItemTax;

        totalItemTax = tax * price;
        return totalItemTax;
    }
}
