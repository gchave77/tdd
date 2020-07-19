package module10;

import goods.*;

import java.text.DecimalFormat;

public class App
{
    public static void main(String[] args)
    {
        DecimalFormat money = new DecimalFormat("#0.00");

        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = Book1249.getPurchase(Book1249.tax, Book1249.price);
        System.out.println(Book1249.name + ": " + Book1249.price + " tax: " + purchaseTax1a);

        double purchaseTax1b = MusicCD1499.getPurchase(MusicCD1499.tax, MusicCD1499.price);
        System.out.println(MusicCD1499.name + ": " + MusicCD1499.price + " tax: " + purchaseTax1b);

        double purchaseTax1c = ChocolateBar085.getPurchase(ChocolateBar085.tax, ChocolateBar085.price);
        System.out.println(MusicCD1499.name + ": " + ChocolateBar085.price + " tax: " + purchaseTax1c);

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Book1249.price + MusicCD1499.price + ChocolateBar085.price;


        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = ImportedBoxOfChocolates1000.getPurchase(ImportedBoxOfChocolates1000.tax, ImportedBoxOfChocolates1000.price);
        System.out.println(ImportedBoxOfChocolates1000.name + ": " + ImportedBoxOfChocolates1000.price + " tax: " + purchaseTax2a);

        double purchaseTax2b = ImportedBottleOfPerfume4750.getPurchase(ImportedBottleOfPerfume4750.tax, ImportedBottleOfPerfume4750.price);
        System.out.println(ImportedBottleOfPerfume4750.name + ": " + ImportedBottleOfPerfume4750.price + " tax: " + purchaseTax2b);

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = ImportedBoxOfChocolates1000.price + ImportedBottleOfPerfume4750.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = ImportedBottleOfPerfume2799.getPurchase(ImportedBottleOfPerfume2799.tax, ImportedBottleOfPerfume2799.price);
        System.out.println(ImportedBottleOfPerfume2799.name + ": " + ImportedBottleOfPerfume2799.price + " tax: " + purchaseTax3a);

        double purchaseTax3b = BottleOfPerfume1899.getPurchase(BottleOfPerfume1899.tax, BottleOfPerfume1899.price);
        System.out.println(BottleOfPerfume1899.name + ": " + BottleOfPerfume1899.price + " tax: " + purchaseTax3b);

        double purchaseTax3c = PacketOfHeadachePills975.getPurchase(PacketOfHeadachePills975.tax, PacketOfHeadachePills975.price);
        System.out.println(PacketOfHeadachePills975.name + ": " + PacketOfHeadachePills975.price + " tax: " + purchaseTax3c);

        double purchaseTax3d = BoxOfImportedChocolates1125.getPurchase(BoxOfImportedChocolates1125.tax, BoxOfImportedChocolates1125.price);
        System.out.println(BoxOfImportedChocolates1125.name + ": " + BoxOfImportedChocolates1125.price + " tax: " + purchaseTax3d);

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = ImportedBottleOfPerfume2799.price + BottleOfPerfume1899.price + PacketOfHeadachePills975.price + BoxOfImportedChocolates1125.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));

    }
}
