package com.switchfully.springdi.springbootdependencyinjection.calculations;

import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.FrenchTaxCalculation;
import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.TaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FrenchTaxCalculationTest {

    @Test
    void whenGivenYearlyIncome_AmericanTaxesAreCalculated() {
        TaxCalculation taxCalculation = new FrenchTaxCalculation();
        double expectedYearlytax = 4800;

        double actualYearlyTax = taxCalculation.calculateTaxes(10000.0);

        Assertions.assertEquals(expectedYearlytax, actualYearlyTax);

    }

}
