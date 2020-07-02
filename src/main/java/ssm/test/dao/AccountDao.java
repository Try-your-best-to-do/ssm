package ssm.test.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import ssm.test.domain.Account;

import java.util.List;

/*
* 账户Dao接口
* */
@Repository
public interface AccountDao {

    //查询所有
    @Select("select * from account")
    public List<Account> findAll();

    //保存账户
    @Insert("insert into account (name,money) values (#{name},#{money})")
    public  void  saveAccount(Account account);

    //删除账户
    @Delete("delete from account where id = #{id}")
    public void Delete(Integer id);

}
