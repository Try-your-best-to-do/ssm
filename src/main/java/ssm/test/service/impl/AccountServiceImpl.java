package ssm.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.test.dao.AccountDao;
import ssm.test.domain.Account;
import ssm.test.service.AccountService;

import java.util.List;


@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public List<Account> findAll() {
        System.out.println("业务层：查询所有。。。");
        return accountDao.findAll();
    }


    public void saveAccount(Account account) {
        System.out.println("业务层：保存用户。。，");
        accountDao.saveAccount(account);
    }

    @Override
    public void Delete(Integer id) {
        System.out.println("业务层：删除账户。。。");
        accountDao.Delete(id);
    }
}
