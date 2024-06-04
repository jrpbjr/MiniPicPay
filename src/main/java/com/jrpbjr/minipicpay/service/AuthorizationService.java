package com.jrpbjr.minipicpay.service;

import com.jrpbjr.minipicpay.client.AuthorizationClient;
import com.jrpbjr.minipicpay.controller.dto.TransferDto;
import com.jrpbjr.minipicpay.exception.PicPayException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationService {

    private final AuthorizationClient authorizationClient;

    public AuthorizationService(AuthorizationClient authorizationClient) {
        this.authorizationClient = authorizationClient;
    }

    public boolean isAuthorized(TransferDto transfer) {

        var resp = authorizationClient.isAuthorized();

        if (resp.getStatusCode().isError()) {
            throw new PicPayException();
        }

        return resp.getBody().authorized();
    }
}
