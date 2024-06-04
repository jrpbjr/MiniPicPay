package com.jrpbjr.minipicpay.repository;

import com.jrpbjr.minipicpay.entity.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferRepository extends JpaRepository<Transfer, UUID> {
}