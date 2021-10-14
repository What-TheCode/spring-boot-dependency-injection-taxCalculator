package com.switchfully.springdi.springbootdependencyinjection.taxCalculation;

import org.springframework.stereotype.Component;

@Component("FrenchCalculation")
public class FrenchTaxCalculation implements TaxCalculation{
    private static final double TAX_RATE = 0.48;

    @Override
    public Double calculateTaxes(Double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
