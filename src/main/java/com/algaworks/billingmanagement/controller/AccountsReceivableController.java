package com.algaworks.billingmanagement.controller;

import com.algaworks.billingmanagement.model.AccountReceivableModel;
import com.algaworks.billingmanagement.repository.AccountsReceivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/accounts-receivable")
public class AccountsReceivableController {

    @Autowired
    private AccountsReceivable accountsReceivable;

    @RequestMapping("/new")
    public String newAccountReceivable() {

        return "Register";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String save(AccountReceivableModel accountReceivable) {

        accountsReceivable.save(accountReceivable);

        return "Register";
    }

}
