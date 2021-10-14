package com.switchfully.springdi.springbootdependencyinjection.taxCalculation;

import org.springframework.stereotype.Component;

@Component("AmericanCalculation")
public class AmericanTaxCalculation implements TaxCalculation {
    private static final double LUMP_SUM = 950;
    private static final double TAX_RATE = 0.18;

    @Override
    public Double calculateTaxes(Double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
