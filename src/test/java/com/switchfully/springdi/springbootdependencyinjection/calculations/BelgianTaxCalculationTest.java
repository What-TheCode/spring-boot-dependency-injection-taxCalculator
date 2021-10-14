package com.switchfully.springdi.springbootdependencyinjection.calculations;

import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.BelgianTaxCalculation;
import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.TaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BelgianTaxCalculationTest {

    @Test
    void whenGivenYearlyIncome_AmericanTaxesAreCalculated() {
        TaxCalculation taxCalculation = new BelgianTaxCalculation();
        double expectedYearlytax = 4500;

        double actualYearlyTax = taxCalculation.calculateTaxes(10000.0);

        Assertions.assertEquals(expectedYearlytax, actualYearlyTax);

    }

}
