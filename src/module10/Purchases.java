package module10;

import goods.*;

import java.text.DecimalFormat;

public class Purchases
{
    static DecimalFormat money = new DecimalFormat("#0.00");

    public static void outputOne() {

        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = TaxCalculator.calcTax(Books.tax, Book.priceBook, false);
        System.out.println(Book.nameBook + ": " + Book.priceBook + " plus tax: " + purchaseTax1a + " = " + money.format(Book.priceBook + purchaseTax1a));

        double purchaseTax1b = TaxCalculator.calcTax(Goods.tax, Good.priceMusicCD, false);
        System.out.println(Good.nameMusicCD + ": " + Good.priceMusicCD + " plus tax: " + purchaseTax1b + " = " + money.format(Good.priceMusicCD + purchaseTax1b));

        double purchaseTax1c = TaxCalculator.calcTax(Foods.tax, Food.priceChocolateBar, false);
        System.out.println(Food.nameChocolateBar + ": " + Food.priceChocolateBar + " plus tax: " + purchaseTax1c + " = " + money.format(Food.priceChocolateBar + purchaseTax1c));

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Book.priceBook + Good.priceMusicCD + Food.priceChocolateBar;

        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");
    }

    public static void outputTwo() {

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = TaxCalculator.calcTax(Foods.tax, Food.priceImportedBoxOfChocolates, true);
        System.out.println(Food.nameImportedBoxOfChocolates + ": " + Food.priceImportedBoxOfChocolates + " plus tax: " + purchaseTax2a + " = " + money.format(Food.priceImportedBoxOfChocolates + purchaseTax2a));

        double purchaseTax2b = TaxCalculator.calcTax(Goods.tax, Good.priceImportedBottleOfPerfume, true);
        System.out.println(Good.nameImportedBottleOfPerfume + ": " + Good.priceImportedBottleOfPerfume + " plus tax: " + purchaseTax2b + " = " + money.format(Good.priceImportedBottleOfPerfume + purchaseTax2b));

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = Food.priceImportedBoxOfChocolates + Good.priceImportedBottleOfPerfume;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");
    }

    public static void outputThree() {

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = TaxCalculator.calcTax(Goods.tax, Good.priceBottleOfImportedPerfume, true);
        System.out.println(Good.nameBottleOfImportedPerfume + ": " + Good.priceBottleOfImportedPerfume + " plus tax: " + purchaseTax3a + " = " + money.format(Good.priceBottleOfImportedPerfume + purchaseTax3a));

        double purchaseTax3b = TaxCalculator.calcTax(Goods.tax, Good.priceBottleOfPerfume, false);
        System.out.println(Good.nameBottleOfPerfume + ": " + Good.priceBottleOfPerfume + " plus tax: " + purchaseTax3b + " = " + money.format(Good.priceBottleOfPerfume + purchaseTax3b));

        double purchaseTax3c = TaxCalculator.calcTax(MedicalProducts.tax, MedicalProduct.pricePacketOfHeadachePills, false);
        System.out.println(MedicalProduct.namePacketOfHeadachePills + ": " + MedicalProduct.pricePacketOfHeadachePills + " plus tax: " + purchaseTax3c + " = " + money.format(MedicalProduct.pricePacketOfHeadachePills + purchaseTax3c));

        double purchaseTax3d = TaxCalculator.calcTax(Foods.tax, Food.priceBoxOfImportedChocolates, true);
        System.out.println(Food.nameBoxOfImportedChocolates + ": " + Food.priceBoxOfImportedChocolates + " tax: " + purchaseTax3d + " = " + money.format(Food.priceBoxOfImportedChocolates + purchaseTax3d));

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = Good.priceBottleOfImportedPerfume + Good.priceBottleOfPerfume + MedicalProduct.pricePacketOfHeadachePills + Food.priceBoxOfImportedChocolates;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));
    }

}
