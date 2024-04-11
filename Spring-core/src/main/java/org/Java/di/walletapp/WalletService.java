package org.Java.di.walletapp;

import java.util.List;
import java.util.Optional;

public interface WalletService {
    Wallet createWallet(Wallet wallet);
    Optional<Wallet> getWalletByMobile(String mobile);
    Optional<Wallet> getWalletById(String id);
    List<Wallet> getWallet();
}
