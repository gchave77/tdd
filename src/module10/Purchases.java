package module10;

import goods.*;

import java.text.DecimalFormat;

public class Purchases
{
    static DecimalFormat money = new DecimalFormat("#0.00");

    public static void outputOne() {

        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = Books.calcTax(Books.tax, Book1249.price, Book1249.isImport);
        System.out.println(Book1249.name + ": " + Book1249.price + " tax: " + purchaseTax1a);

        double purchaseTax1b = Goods.calcTax(MusicCD1499.tax, MusicCD1499.price, MusicCD1499.isImport);
        System.out.println(MusicCD1499.name + ": " + MusicCD1499.price + " tax: " + purchaseTax1b);

        double purchaseTax1c = Food.calcTax(ChocolateBar085.tax, ChocolateBar085.price, ChocolateBar085.isImport);
        System.out.println(MusicCD1499.name + ": " + ChocolateBar085.price + " tax: " + purchaseTax1c);

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Book1249.price + MusicCD1499.price + ChocolateBar085.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");
    }

    public static void outputTwo() {

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = Food.calcTax(ImportedBoxOfChocolates1000.tax, ImportedBoxOfChocolates1000.price, ImportedBoxOfChocolates1000.isImport);
        System.out.println(ImportedBoxOfChocolates1000.name + ": " + ImportedBoxOfChocolates1000.price + " tax: " + purchaseTax2a);

        double purchaseTax2b = Goods.calcTax(ImportedBottleOfPerfume4750.tax, ImportedBottleOfPerfume4750.price, ImportedBottleOfPerfume4750.isImport);
        System.out.println(ImportedBottleOfPerfume4750.name + ": " + ImportedBottleOfPerfume4750.price + " tax: " + purchaseTax2b);

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = ImportedBoxOfChocolates1000.price + ImportedBottleOfPerfume4750.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");
    }

    public static void outputThree() {

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = Goods.calcTax(ImportedBottleOfPerfume2799.tax, ImportedBottleOfPerfume2799.price, ImportedBottleOfPerfume2799.isImport);
        System.out.println(ImportedBottleOfPerfume2799.name + ": " + ImportedBottleOfPerfume2799.price + " tax: " + purchaseTax3a);

        double purchaseTax3b = Goods.calcTax(BottleOfPerfume1899.tax, BottleOfPerfume1899.price, BottleOfPerfume1899.isImport);
        System.out.println(BottleOfPerfume1899.name + ": " + BottleOfPerfume1899.price + " tax: " + purchaseTax3b);

        double purchaseTax3c = MedicalProducts.calcTax(PacketOfHeadachePills975.tax, PacketOfHeadachePills975.price, PacketOfHeadachePills975.isImport);
        System.out.println(PacketOfHeadachePills975.name + ": " + PacketOfHeadachePills975.price + " tax: " + purchaseTax3c);

        double purchaseTax3d = Food.calcTax(BoxOfImportedChocolates1125.tax, BoxOfImportedChocolates1125.price, BoxOfImportedChocolates1125.isImport);
        System.out.println(BoxOfImportedChocolates1125.name + ": " + BoxOfImportedChocolates1125.price + " tax: " + purchaseTax3d);

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = ImportedBottleOfPerfume2799.price + BottleOfPerfume1899.price + PacketOfHeadachePills975.price + BoxOfImportedChocolates1125.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));
    }

}
