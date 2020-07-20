package module10;

import goods.*;

import java.text.DecimalFormat;

public class Purchases
{
    static DecimalFormat money = new DecimalFormat("#0.00");

    public static void outputOne() {

        // Input/Output 1
        System.out.println("Output 1");
        double purchaseTax1a = TaxCalculator.calcTax(Book.tax, Books.priceBook, false);
        System.out.println(Books.nameBook + ": " + Books.priceBook + " plus tax: " + purchaseTax1a + " = " + money.format(Books.priceBook + purchaseTax1a));

        double purchaseTax1b = TaxCalculator.calcTax(Good.tax, Goods.priceMusicCD, false);
        System.out.println(Goods.nameMusicCD + ": " + Goods.priceMusicCD + " plus tax: " + purchaseTax1b + " = " + money.format(Goods.priceMusicCD + purchaseTax1b));

        double purchaseTax1c = TaxCalculator.calcTax(Food.tax, Foods.priceChocolateBar, false);
        System.out.println(Foods.nameChocolateBar + ": " + Foods.priceChocolateBar + " plus tax: " + purchaseTax1c + " = " + money.format(Foods.priceChocolateBar + purchaseTax1c));

        double outputTax1 = (purchaseTax1a + purchaseTax1b + purchaseTax1c);
        double outputPrice1 = Books.priceBook + Goods.priceMusicCD + Foods.priceChocolateBar;

        System.out.println("Total Sales Tax: " + money.format(outputTax1));
        System.out.println("Grand Total: " + money.format(outputTax1 + outputPrice1));
        System.out.println(" ");
    }

    public static void outputTwo() {

        // Input/Output 2
        System.out.println("Output 2");
        double purchaseTax2a = TaxCalculator.calcTax(Food.tax, Foods.priceImportedBoxOfChocolates, true);
        System.out.println(Foods.nameImportedBoxOfChocolates + ": " + Foods.priceImportedBoxOfChocolates + " plus tax: " + purchaseTax2a + " = " + money.format(Foods.priceImportedBoxOfChocolates + purchaseTax2a));

        double purchaseTax2b = TaxCalculator.calcTax(Good.tax, Goods.priceImportedBottleOfPerfume, true);
        System.out.println(Goods.nameImportedBottleOfPerfume + ": " + Goods.priceImportedBottleOfPerfume + " plus tax: " + purchaseTax2b + " = " + money.format(Goods.priceImportedBottleOfPerfume + purchaseTax2b));

        double outputTax2 = purchaseTax2a + purchaseTax2b;
        double outputPrice2 = Foods.priceImportedBoxOfChocolates + Goods.priceImportedBottleOfPerfume;

        System.out.println("Total Sales Tax: " + money.format(outputTax2));
        System.out.println("Grand Total: " + money.format(outputTax2 + outputPrice2));
        System.out.println(" ");
    }

    public static void outputThree() {

        // Input/Output 3
        System.out.println("Output 3");
        double purchaseTax3a = TaxCalculator.calcTax(Good.tax, Goods.priceBottleOfImportedPerfume, true);
        System.out.println(Goods.nameBottleOfImportedPerfume + ": " + Goods.priceBottleOfImportedPerfume + " plus tax: " + purchaseTax3a + " = " + money.format(Goods.priceBottleOfImportedPerfume + purchaseTax3a));

        double purchaseTax3b = TaxCalculator.calcTax(Good.tax, Goods.priceBottleOfPerfume, false);
        System.out.println(Goods.nameBottleOfPerfume + ": " + Goods.priceBottleOfPerfume + " plus tax: " + purchaseTax3b + " = " + money.format(Goods.priceBottleOfPerfume + purchaseTax3b));

        double purchaseTax3c = TaxCalculator.calcTax(MedicalProduct.tax, MedicalProducts.pricePacketOfHeadachePills, false);
        System.out.println(MedicalProducts.namePacketOfHeadachePills + ": " + MedicalProducts.pricePacketOfHeadachePills + " plus tax: " + purchaseTax3c + " = " + money.format(MedicalProducts.pricePacketOfHeadachePills + purchaseTax3c));

        double purchaseTax3d = TaxCalculator.calcTax(Food.tax, Foods.priceBoxOfImportedChocolates, true);
        System.out.println(Foods.nameBoxOfImportedChocolates + ": " + Foods.priceBoxOfImportedChocolates + " tax: " + purchaseTax3d + " = " + money.format(Foods.priceBoxOfImportedChocolates + purchaseTax3d));

        double outputTax3 = purchaseTax3a + purchaseTax3b + purchaseTax3c + purchaseTax3d;
        double outputPrice3 = Goods.priceBottleOfImportedPerfume + Goods.priceBottleOfPerfume + MedicalProducts.pricePacketOfHeadachePills + Foods.priceBoxOfImportedChocolates;

        System.out.println("Total Sales Tax: " + money.format(outputTax3));
        System.out.println("Grand Total: " + money.format(outputTax3 + outputPrice3));
    }

}
