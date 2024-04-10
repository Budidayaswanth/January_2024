package org.Java.di.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class AccountServiceMapping {
    @Autowired
    private AccountManager accountManager;
    @Autowired
    private ServiceManager serviceManager;

    public Map<Account, List<ServiceInfo>> getAccountWithService(){
        Map<Account,List<ServiceInfo>> map =new HashMap<>();
        List<Account> accountInfo = accountManager.getActiveAccount();
        int i =2;
        for (Account account:accountInfo){
            map.put(account,getServices(i++));
        }
        return map;
    }
    private List<ServiceInfo> getServices(int num){
        List<ServiceInfo> serviceInfos =serviceManager.getActiveService();
        if(num >serviceInfos.size()){
            return serviceInfos;
        }
        return serviceInfos.subList(0,num);
    }
}
