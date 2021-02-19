package com.algaworks.billingmanagement.repository;

import com.algaworks.billingmanagement.model.AccountReceivableModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountsReceivable extends JpaRepository<AccountReceivableModel, Long> {

}
