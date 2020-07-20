package jUnit5Test;

import goods.*;
import module10.*;

import static org.junit.jupiter.api.Assertions.*;

class PurchasesTest
{

    @org.junit.jupiter.api.Test
    void outputOne1a()
    {
        double purchaseTax1a = TaxCalculator.calcTax(Books.tax, Book1249.price, Book1249.isImport);
        assertEquals(0.0, purchaseTax1a);
    }

    @org.junit.jupiter.api.Test
    void outputOne1b()
    {
        double purchaseTax1b = TaxCalculator.calcTax(MusicCD1499.tax, MusicCD1499.price, MusicCD1499.isImport);
        assertEquals(1.50, purchaseTax1b);
    }

    @org.junit.jupiter.api.Test
    void outputOne1c()
    {
        double purchaseTax1c = TaxCalculator.calcTax(ChocolateBar085.tax, ChocolateBar085.price, ChocolateBar085.isImport);
        assertEquals(0.0, purchaseTax1c);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2a()
    {
        double purchaseTax2a = TaxCalculator.calcTax(ImportedBoxOfChocolates1000.tax, ImportedBoxOfChocolates1000.price, ImportedBoxOfChocolates1000.isImport);
        assertEquals(0.50, purchaseTax2a);
    }

    @org.junit.jupiter.api.Test
    void outputTwo2b()
    {
        double purchaseTax2b = TaxCalculator.calcTax(ImportedBottleOfPerfume4750.tax, ImportedBottleOfPerfume4750.price, ImportedBottleOfPerfume4750.isImport);
        assertEquals(7.15, purchaseTax2b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3a()
    {
        double purchaseTax3a = TaxCalculator.calcTax(ImportedBottleOfPerfume2799.tax, ImportedBottleOfPerfume2799.price, ImportedBottleOfPerfume2799.isImport);
        assertEquals(4.20, purchaseTax3a);
    }

    @org.junit.jupiter.api.Test
    void outputThree3b()
    {
        double purchaseTax3b = TaxCalculator.calcTax(BottleOfPerfume1899.tax, BottleOfPerfume1899.price, BottleOfPerfume1899.isImport);
        assertEquals(1.90, purchaseTax3b);
    }

    @org.junit.jupiter.api.Test
    void outputThree3c()
    {
        double purchaseTax3c = TaxCalculator.calcTax(PacketOfHeadachePills975.tax, PacketOfHeadachePills975.price, PacketOfHeadachePills975.isImport);
        assertEquals(0.0, purchaseTax3c);
    }

    @org.junit.jupiter.api.Test
    void outputThree3d()
    {
        double purchaseTax3d = TaxCalculator.calcTax(BoxOfImportedChocolates1125.tax, BoxOfImportedChocolates1125.price, BoxOfImportedChocolates1125.isImport);
        assertEquals(0.60, purchaseTax3d);
    }

}