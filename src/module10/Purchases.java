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

        double purchaseTax1b = TaxCalculator.calcTax(Goods.tax, MusicCD.price, MusicCD.isImport);
        double value = TaxCalculator.calcTax(Goods.tax, MusicCD.price, MusicCD.isImport);
        System.out.println(MusicCD.name + ": " + MusicCD.price + " plus tax: " + purchaseTax1b + " = " + money.format(MusicCD.price + purchaseTax1b));

        double purchaseTax1c = TaxCalculator.calcTax(Foods.tax, ChocolateBar.price, ChocolateBar.isImport);
        System.out.println(ChocolateBar.name + ": " + ChocolateBar.price + " plus tax: " + purchaseTax1c + " = " + money.format(ChocolateBar.price + purchaseTax1c));

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Book.price + MusicCD.price + ChocolateBar.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");
    }

    public static void outputTwo() {

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = TaxCalculator.calcTax(Foods.tax, ImportedBoxOfChocolates.price, ImportedBoxOfChocolates.isImport);
        System.out.println(ImportedBoxOfChocolates.name + ": " + ImportedBoxOfChocolates.price + " plus tax: " + purchaseTax2a + " = " + money.format(ImportedBoxOfChocolates.price + purchaseTax2a));

        double purchaseTax2b = TaxCalculator.calcTax(Goods.tax, ImportedBottleOfPerfume.price, ImportedBottleOfPerfume.isImport);
        System.out.println(ImportedBottleOfPerfume.name + ": " + ImportedBottleOfPerfume.price + " plus tax: " + purchaseTax2b + " = " + money.format(ImportedBottleOfPerfume.price + purchaseTax2b));

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = ImportedBoxOfChocolates.price + ImportedBottleOfPerfume.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");
    }

    public static void outputThree() {

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = TaxCalculator.calcTax(Goods.tax, BottleOfImportedPerfume.price, BottleOfImportedPerfume.isImport);
        System.out.println(BottleOfImportedPerfume.name + ": " + BottleOfImportedPerfume.price + " plus tax: " + purchaseTax3a + " = " + money.format(BottleOfImportedPerfume.price + purchaseTax3a));

        double purchaseTax3b = TaxCalculator.calcTax(Goods.tax, BottleOfPerfume.price, BottleOfPerfume.isImport);
        System.out.println(BottleOfPerfume.name + ": " + BottleOfPerfume.price + " plus tax: " + purchaseTax3b + " = " + money.format(BottleOfPerfume.price + purchaseTax3b));

        double purchaseTax3c = TaxCalculator.calcTax(MedicalProducts.tax, PacketOfHeadachePills.price, PacketOfHeadachePills.isImport);
        System.out.println(PacketOfHeadachePills.name + ": " + PacketOfHeadachePills.price + " plus tax: " + purchaseTax3c + " = " + money.format(PacketOfHeadachePills.price + purchaseTax3c));

        double purchaseTax3d = TaxCalculator.calcTax(Foods.tax, BoxOfImportedChocolates.price, BoxOfImportedChocolates.isImport);
        System.out.println(BoxOfImportedChocolates.name + ": " + BoxOfImportedChocolates.price + " tax: " + purchaseTax3d + " = " + money.format(BoxOfImportedChocolates.price + purchaseTax3d));

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = BottleOfImportedPerfume.price + BottleOfPerfume.price + PacketOfHeadachePills.price + BoxOfImportedChocolates.price;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));
    }

}
