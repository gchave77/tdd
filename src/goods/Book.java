package goods;

import module10.Books;

public abstract class Book extends Books
{
    public static String name = "Book";
    public static double price = 12.49d;

    public Book(double tax)
    {
        super(tax);
    }

}
