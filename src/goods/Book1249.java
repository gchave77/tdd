package goods;

import module10.Books;

public class Book1249 extends Books
{
    public static String name = "Non Imported Book";
    public static double price = 12.49d;
    public static boolean isImport = false;

    public Book1249(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
