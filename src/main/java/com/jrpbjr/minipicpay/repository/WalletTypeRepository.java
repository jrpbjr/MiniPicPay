package com.jrpbjr.minipicpay.repository;

import com.jrpbjr.minipicpay.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}