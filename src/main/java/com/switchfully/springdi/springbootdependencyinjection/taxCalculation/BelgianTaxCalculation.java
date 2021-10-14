package com.switchfully.springdi.springbootdependencyinjection.taxCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("BelgianCalculation")
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.45;

    @Override
    public Double calculateTaxes(Double yearlyIncome) {
        return yearlyIncome * 0.45;


    }
}
