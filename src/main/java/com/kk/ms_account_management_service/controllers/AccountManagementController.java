package com.kk.ms_account_management_service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountManagementController {

    @GetMapping("/status")
    public String status() {
        return "working";
    }
}
