package org.Java.di.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class invoiceService {
    @Autowired
    private AccountServiceMapping accountServiceMapping;
    public void showInvoiceAmountForAllAccount(){
        Map<Account, List<ServiceInfo>> map =accountServiceMapping.getAccountWithService();
        for(Map.Entry<Account,List<ServiceInfo>> entry :map.entrySet()){
            Account account =entry.getKey();
            List<ServiceInfo> serviceInfos =entry.getValue();
            double totalAmount =serviceInfos.stream().mapToDouble(ServiceInfo::getAmount).sum();
            System.out.println("Dear "+account.getName()+
                    ", total "+ serviceInfos.size()+
                    " services are subscribed for the account number : "+
                    account.getAccountNumber()+" and the total amount is : "+totalAmount+".");
            System.out.println("More Details : ");
            serviceInfos.forEach(System.out::println);
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
