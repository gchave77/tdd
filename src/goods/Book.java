package goods;

import module10.Books;

public abstract class Book extends Books
{
    public static String nameBook = "Book";
    public static double priceBook = 12.49d;

    public Book(double tax)
    {
        super(tax);
    }

}
