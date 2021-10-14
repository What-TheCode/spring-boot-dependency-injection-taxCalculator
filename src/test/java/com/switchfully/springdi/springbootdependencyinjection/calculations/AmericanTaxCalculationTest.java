package com.switchfully.springdi.springbootdependencyinjection.calculations;

import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.AmericanTaxCalculation;
import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.TaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AmericanTaxCalculationTest {

    @Test
    void whenGivenYearlyIncome_AmericanTaxesAreCalculated() {
        TaxCalculation taxCalculation = new AmericanTaxCalculation();
        double expectedYearlytax = 2750;

        double actualYearlyTax = taxCalculation.calculateTaxes(10000.0);

        Assertions.assertEquals(expectedYearlytax, actualYearlyTax);

    }

}
