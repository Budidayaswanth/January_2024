package org.Java.di.walletapp;

import java.util.List;

public interface WalletAndTxnService {
    Wallet  createWallet(Wallet wallet);
    void transferAmount(String fromMobile,String Mobile,double amount);
    List<TransactionDetails> getTransactions(String mobile);

}
