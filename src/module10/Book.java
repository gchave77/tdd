package module10;

public abstract class Book extends Good
{
    public static double tax = 0.0d;

    public Book(double tax)
    {
        super(tax);
        this.setTax(Book.tax);
    }

}
