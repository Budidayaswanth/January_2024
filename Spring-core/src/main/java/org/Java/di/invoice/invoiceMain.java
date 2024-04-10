package org.Java.di.invoice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.invoice")
public class invoiceMain {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(invoiceMain.class);
        invoiceService invoiceService =context.getBean("invoiceService", org.Java.di.invoice.invoiceService.class);
        invoiceService.showInvoiceAmountForAllAccount();
    }
}
