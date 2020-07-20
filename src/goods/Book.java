package goods;

import module10.Books;

public class Book extends Books
{
    public static String name = "Book";
    public static double price = 12.49d;
    public static boolean isImport = false;

    public Book(double tax, String name, double price, boolean isImport)
    {
        super(tax);
    }

}
