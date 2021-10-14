package com.switchfully.springdi.springbootdependencyinjection.taxCalculator;

import com.switchfully.springdi.springbootdependencyinjection.taxCalculation.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("AmericanCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxesBasedOnYearlyIncome(double yearlyIncome) {
        return this.taxCalculation.calculateTaxes(yearlyIncome);
    }

}
