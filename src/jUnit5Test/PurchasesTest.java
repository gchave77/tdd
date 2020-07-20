package jUnit5Test;

import goods.*;
import module10.*;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesTest
{

    @org.junit.jupiter.api.Test
    void outputOne1a()
    {
        double purchaseTax1a = TaxCalculator.calcTax(Books.tax, Book.price, false);
        assertEquals(0.0, purchaseTax1a);
    }

    @org.junit.jupiter.api.Test
    void outputOne1b()
    {
        double purchaseTax1b = TaxCalculator.calcTax(Goods.tax, Good.priceMusicCD, false);
        assertEquals(1.50, purchaseTax1b);
    }

    @org.junit.jupiter.api.Test
    void outputOne1c()
    {
        double purchaseTax1c = TaxCalculator.calcTax(Foods.tax, Food.priceChocolateBar, false);
        assertEquals(0.0, purchaseTax1c);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2a()
    {
        double purchaseTax2a = TaxCalculator.calcTax(Foods.tax, Food.priceImportedBoxOfChocolates, true);
        assertEquals(0.50, purchaseTax2a);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2b()
    {
        double purchaseTax2b = TaxCalculator.calcTax(Goods.tax, Good.priceImportedBottleOfPerfume, true);
        assertEquals(7.15, purchaseTax2b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3a()
    {
        double purchaseTax3a = TaxCalculator.calcTax(Goods.tax, Good.priceBottleOfImportedPerfume, true);
        assertEquals(4.20, purchaseTax3a);
    }

    @org.junit.jupiter.api.Test
    void outputThree3b()
    {
        double purchaseTax3b = TaxCalculator.calcTax(Goods.tax, Good.priceBottleOfPerfume, false);
        assertEquals(1.90, purchaseTax3b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3c()
    {
        double purchaseTax3c = TaxCalculator.calcTax(MedicalProducts.tax, MedicalProduct.price, false);
        assertEquals(0.0, purchaseTax3c);
    }

    @org.junit.jupiter.api.Test
    void outputThree3d()
    {
        double purchaseTax3d = TaxCalculator.calcTax(Foods.tax, Food.priceBoxOfImportedChocolates, true);
        assertEquals(0.60, purchaseTax3d);
    }

}