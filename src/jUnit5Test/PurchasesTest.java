package jUnit5Test;

import goods.*;
import module10.*;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesTest
{

    @org.junit.jupiter.api.Test
    void outputOne1a()
    {
        double purchaseTax1a = TaxCalculator.calcTax(Books.tax, Book.price, Book.isImport);
        assertEquals(0.0, purchaseTax1a);
    }

    @org.junit.jupiter.api.Test
    void outputOne1b()
    {
        double purchaseTax1b = TaxCalculator.calcTax(Goods.tax, MusicCD.price, MusicCD.isImport);
        assertEquals(1.50, purchaseTax1b);
    }

    @org.junit.jupiter.api.Test
    void outputOne1c()
    {
        double purchaseTax1c = TaxCalculator.calcTax(Food.tax, ChocolateBar.price, ChocolateBar.isImport);
        assertEquals(0.0, purchaseTax1c);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2a()
    {
        double purchaseTax2a = TaxCalculator.calcTax(Food.tax, ImportedBoxOfChocolates.price, ImportedBoxOfChocolates.isImport);
        assertEquals(0.50, purchaseTax2a);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2b()
    {
        double purchaseTax2b = TaxCalculator.calcTax(Goods.tax, ImportedBottleOfPerfume.price, ImportedBottleOfPerfume.isImport);
        assertEquals(7.15, purchaseTax2b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3a()
    {
        double purchaseTax3a = TaxCalculator.calcTax(Goods.tax, BottleOfImportedPerfume.price, BottleOfImportedPerfume.isImport);
        assertEquals(4.20, purchaseTax3a);
    }

    @org.junit.jupiter.api.Test
    void outputThree3b()
    {
        double purchaseTax3b = TaxCalculator.calcTax(Goods.tax, BottleOfPerfume.price, BottleOfPerfume.isImport);
        assertEquals(1.90, purchaseTax3b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3c()
    {
        double purchaseTax3c = TaxCalculator.calcTax(MedicalProducts.tax, PacketOfHeadachePills.price, PacketOfHeadachePills.isImport);
        assertEquals(0.0, purchaseTax3c);
    }

    @org.junit.jupiter.api.Test
    void outputThree3d()
    {
        double purchaseTax3d = TaxCalculator.calcTax(Food.tax, BoxOfImportedChocolates.price, BoxOfImportedChocolates.isImport);
        assertEquals(0.60, purchaseTax3d);
    }

}