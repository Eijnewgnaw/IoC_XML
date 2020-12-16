package Account.Service.impl;

import Account.Dao.Dao;
import Account.Service.Service;
import Account.domain.Account;

import java.util.List;

public class ImpAccountService implements Service {

    private Dao dao;

    public void setDao(Dao dao) {
        this.dao = dao;
    }

    public List<Account> findAllAccount() {
        return dao.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return dao.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        dao.saveAccount(account);
    }

    public void updateAccount(Account account) {
        dao.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        dao.deleteAccount(accountId);
    }
}
