package Goods;

import module10.Books;

public class Book1249 extends Books
{
    String name = "Book $12.49";
    double price = 12.49;

    public Book1249(double tax, String name, double price)
    {
        super(tax);
        this.name = name;
        this.price = price;
    }

}
