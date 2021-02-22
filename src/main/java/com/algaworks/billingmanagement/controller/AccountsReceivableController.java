package com.algaworks.billingmanagement.controller;

import com.algaworks.billingmanagement.model.AccountReceivableModel;
import com.algaworks.billingmanagement.model.enumerations.Status;
import com.algaworks.billingmanagement.repository.AccountsReceivable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/accounts-receivable")
public class AccountsReceivableController {

    @Autowired
    private AccountsReceivable accountsReceivable;

    @RequestMapping("/new")
    public ModelAndView newAccountReceivable() {

        ModelAndView modelAndView = new ModelAndView("Register");

        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView save(AccountReceivableModel accountReceivable) {

        accountsReceivable.save(accountReceivable);

        ModelAndView modelAndView = new ModelAndView("Register");
        modelAndView.addObject("message", "Saved successfully!");

        return modelAndView;
    }

    @ModelAttribute("statusAccountReceivable")
    public List<Status> allAccountsReceivableStatus() {

        return Arrays.asList(Status.values());
    }

}
