package ssm.test.service;

import ssm.test.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有
    public List<Account> findAll();

    //保存账户
    public  void  saveAccount(Account account);

    //删除账户
    public  void Delete(Integer id);
}
