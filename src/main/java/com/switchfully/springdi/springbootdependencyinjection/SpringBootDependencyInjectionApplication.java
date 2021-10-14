package com.switchfully.springdi.springbootdependencyinjection;

import com.switchfully.springdi.springbootdependencyinjection.taxCalculator.TaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    @Autowired
    public SpringBootDependencyInjectionApplication(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        double taxesToPay = taxCalculator.calculateTaxesBasedOnYearlyIncome(23000);

        System.out.println();
        System.out.println(String.format("%s taxes!", taxesToPay));
    }

}
