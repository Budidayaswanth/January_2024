package org.Java.di.walletapp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class WalletServiceImpl implements WalletService{
    private final IdGenerator idGenerator;
    List<Wallet> wallets =new ArrayList<>();
    @Override
    public Wallet createWallet(Wallet wallet) {
        Optional<Wallet> optionalWallet=getWalletByMobile(wallet.getMobile());
        if(optionalWallet.isPresent()){
            throw new RuntimeException("Wallet already exist with mobile Number :"+wallet.getMobile());
        }
        wallet.setId(idGenerator.generateID());
        wallets.add(wallet);
        return wallet;
    }
    @Override
    public Optional<Wallet> getWalletByMobile(String mobile) {
        if (!wallets.isEmpty()){
            for (Wallet wallet:wallets){
                if (wallet.getMobile().equals(mobile)){
                    return Optional.of(wallet);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public Optional<Wallet> getWalletById(String id) {
        if (!wallets.isEmpty()){
            for (Wallet wallet:wallets){
                if(wallet.getId().equals(id)){
                    return Optional.of(wallet);
                }
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Wallet> getWallet() {
        return wallets;
    }
}
