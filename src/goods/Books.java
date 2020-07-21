package goods;

import module10.Book;

public abstract class Books extends Book
{
    public static String nameBook = "Books";
    public static double priceBook = 12.49d;

    public Books(double tax)
    {
        super(tax);
    }

}
