package com.jrpbjr.minipicpay.service;

import com.jrpbjr.minipicpay.controller.dto.CreateWalletDto;
import com.jrpbjr.minipicpay.entity.Wallet;
import com.jrpbjr.minipicpay.exception.WalletDataAlreadyExistsException;
import com.jrpbjr.minipicpay.repository.WalletRepository;
import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(CreateWalletDto dto) {

        var walletDb = walletRepository.findByCpfCnpjOrEmail(dto.cpfCnpj(), dto.email());
        if (walletDb.isPresent()) {
            throw new WalletDataAlreadyExistsException("CpfCnpj or Email already exists");
        }

        return walletRepository.save(dto.toWallet());
    }
}
