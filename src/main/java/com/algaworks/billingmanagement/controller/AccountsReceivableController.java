package com.algaworks.billingmanagement.controller;

import com.algaworks.billingmanagement.model.AccountsReceivableModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/accounts-receivable")
public class AccountsReceivableController {

    @RequestMapping("/new")
    public String newAccountReceivable() {

        return "Register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(AccountsReceivableModel accountsReceivable) {

        return "Register";
    }

}
