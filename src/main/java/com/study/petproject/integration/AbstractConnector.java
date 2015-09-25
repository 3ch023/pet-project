package com.study.petproject.integration;

import com.study.petproject.dao.Account;

/**
 * Created by Маша on 23.09.15.
 */
public abstract class AbstractConnector {
    abstract void receiveConnection();
    public abstract boolean banUserForAccount(String email, Account account);
    public abstract boolean unBanUserForAccount(String email, Account account);
}
