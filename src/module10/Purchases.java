package module10;

import goods.*;

import java.text.DecimalFormat;

public class Purchases
{
    static DecimalFormat money = new DecimalFormat("#0.00");

    public static void outputOne() {

        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = TaxCalculator.calcTax(Books.tax, Book.price, Book.isImport);
        System.out.println(Book.name + ": " + Book.price + " plus tax: " + purchaseTax1a + " = " + money.format(Book.price + purchaseTax1a));

        double purchaseTax1b = TaxCalculator.calcTax(Goods.tax, MusicCD1499.price, MusicCD1499.isImport);
        System.out.println(MusicCD1499.name + ": " + MusicCD1499.price + " plus tax: " + purchaseTax1b + " = " + money.format(MusicCD1499.price + purchaseTax1b));

        double purchaseTax1c = TaxCalculator.calcTax(Food.tax, ChocolateBar085.price, ChocolateBar085.isImport);
        System.out.println(ChocolateBar085.name + ": " + ChocolateBar085.price + " plus tax: " + purchaseTax1c + " = " + money.format(ChocolateBar085.price + purchaseTax1c));

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Book.price + MusicCD1499.price + ChocolateBar085.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");
    }

    public static void outputTwo() {

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = TaxCalculator.calcTax(Food.tax, ImportedBoxOfChocolates1000.price, ImportedBoxOfChocolates1000.isImport);
        System.out.println(ImportedBoxOfChocolates1000.name + ": " + ImportedBoxOfChocolates1000.price + " plus tax: " + purchaseTax2a + " = " + money.format(ImportedBoxOfChocolates1000.price + purchaseTax2a));

        double purchaseTax2b = TaxCalculator.calcTax(Goods.tax, ImportedBottleOfPerfume4750.price, ImportedBottleOfPerfume4750.isImport);
        System.out.println(ImportedBottleOfPerfume4750.name + ": " + ImportedBottleOfPerfume4750.price + " plus tax: " + purchaseTax2b + " = " + money.format(ImportedBottleOfPerfume4750.price + purchaseTax2b));

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = ImportedBoxOfChocolates1000.price + ImportedBottleOfPerfume4750.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");
    }

    public static void outputThree() {

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = TaxCalculator.calcTax(Goods.tax, ImportedBottleOfPerfume2799.price, ImportedBottleOfPerfume2799.isImport);
        System.out.println(ImportedBottleOfPerfume2799.name + ": " + ImportedBottleOfPerfume2799.price + " plus tax: " + purchaseTax3a + " = " + money.format(ImportedBottleOfPerfume2799.price + purchaseTax3a));

        double purchaseTax3b = TaxCalculator.calcTax(Goods.tax, BottleOfPerfume1899.price, BottleOfPerfume1899.isImport);
        System.out.println(BottleOfPerfume1899.name + ": " + BottleOfPerfume1899.price + " plus tax: " + purchaseTax3b + " = " + money.format(BottleOfPerfume1899.price + purchaseTax3b));

        double purchaseTax3c = TaxCalculator.calcTax(MedicalProducts.tax, PacketOfHeadachePills975.price, PacketOfHeadachePills975.isImport);
        System.out.println(PacketOfHeadachePills975.name + ": " + PacketOfHeadachePills975.price + " plus tax: " + purchaseTax3c + " = " + money.format(PacketOfHeadachePills975.price + purchaseTax3c));

        double purchaseTax3d = TaxCalculator.calcTax(Food.tax, BoxOfImportedChocolates1125.price, BoxOfImportedChocolates1125.isImport);
        System.out.println(BoxOfImportedChocolates1125.name + ": " + BoxOfImportedChocolates1125.price + " tax: " + purchaseTax3d + " = " + money.format(BoxOfImportedChocolates1125.price + purchaseTax3d));

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = ImportedBottleOfPerfume2799.price + BottleOfPerfume1899.price + PacketOfHeadachePills975.price + BoxOfImportedChocolates1125.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));
    }

}
