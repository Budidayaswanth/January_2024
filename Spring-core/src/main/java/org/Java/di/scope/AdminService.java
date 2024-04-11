package org.Java.di.scope;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final AccountDao accountDao;

    public void ShowInvoiceDetails(){
        System.out.println("Account dao :"+accountDao);
        System.out.println("Account Info :"+accountDao.getAccountInfo());
    }
}
