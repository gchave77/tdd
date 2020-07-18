package module10;

import goods.*;

public class App
{
    public static void main(String[] args)
    {
        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = Book1249.getPurchase(Book1249.tax, Book1249.price);
        System.out.println(Book1249.name + ": " + Book1249.price + " tax: " + purchaseTax1a);

        double purchaseTax1b = MusicCD1499.getPurchase(MusicCD1499.tax, MusicCD1499.price);
        System.out.println(MusicCD1499.name + ": " + MusicCD1499.price + " tax: " + purchaseTax1b);

        double purchaseTax1c = ChocolateBar085.getPurchase(ChocolateBar085.tax, ChocolateBar085.price);
        System.out.println(MusicCD1499.name + ": " + ChocolateBar085.price + " tax: " + purchaseTax1c);

        double outputTax1 = purchaseTax1a + purchaseTax1b + purchaseTax1c;
        double outputPrice1 = Book1249.price + MusicCD1499.price + ChocolateBar085.price;

        System.out.println("Total Sales Tax: " + outputTax1);
        System.out.println("Grand Total: " + (outputTax1 + outputPrice1));
        System.out.println(" ");

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = ImportedBoxOfChocolates1000.getPurchase(ImportedBoxOfChocolates1000.tax, ImportedBoxOfChocolates1000.price);
        System.out.println(ImportedBoxOfChocolates1000.name + ": " + ImportedBoxOfChocolates1000.price + " tax: " + purchaseTax2a);

        double purchaseTax2b = ImportedBottleOfPerfume4750.getPurchase(ImportedBottleOfPerfume4750.tax, ImportedBottleOfPerfume4750.price);
        System.out.println(ImportedBottleOfPerfume4750.name + ": " + ImportedBottleOfPerfume4750.price + " tax: " + purchaseTax2b);

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = ImportedBoxOfChocolates1000.price + ImportedBottleOfPerfume4750.price;

        System.out.println("Total Sales Tax: " + outputTax2);
        System.out.println("Grand Total: " + (outputTax2 + outputPrice2));
        System.out.println(" ");


    }
}
