package com.algaworks.billingmanagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountsReceivableController {

    @RequestMapping("/account-receivable/new")
    public String newAccountReceivable() {
        return "Register";
    }

}
