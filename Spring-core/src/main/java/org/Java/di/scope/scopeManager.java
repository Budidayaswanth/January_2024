package org.Java.di.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "org.Java.di.scope")
public class scopeManager {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(scopeManager.class);

        BillingService billingService =context.getBean(BillingService.class);
        AdminService adminService =context.getBean(AdminService.class);
        InvoiceService invoiceService =context.getBean(InvoiceService.class);

        billingService.showInvoiceDetails();
        adminService.ShowInvoiceDetails();
        invoiceService.showInvoiceDetails();
    }
}
