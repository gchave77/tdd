package module10;

import goods.Book1249;
import goods.ChocolateBar085;
import goods.MusicCD1499;

public class App
{
    public static void main(String[] args)
    {
        // Input/Output 1
        double purchaseTax1a = Book1249.getPurchase(Book1249.tax, Book1249.price);
        System.out.println(Book1249.name + ": " + Book1249.price + " tax: " + purchaseTax1a);

        double purchaseTax1b = MusicCD1499.getPurchase(MusicCD1499.tax, MusicCD1499.price);
        System.out.println(MusicCD1499.name + ": " + MusicCD1499.price + " tax: " + purchaseTax1b);

        double purchaseTax1c = ChocolateBar085.getPurchase(ChocolateBar085.tax, ChocolateBar085.price);
        System.out.println(MusicCD1499.name + ": " + ChocolateBar085.price + " tax: " + purchaseTax1c);

        double outputTax1 = purchaseTax1a + purchaseTax1b + purchaseTax1c;
        double outputPrice1 = Book1249.price + MusicCD1499.price + ChocolateBar085.price;
        System.out.println("Total Sales Tax: " + (outputTax1) + " Total: " + (outputTax1 + outputPrice1));

        // Input/Output 2
//        double purchaseTax2a =

    }
}
