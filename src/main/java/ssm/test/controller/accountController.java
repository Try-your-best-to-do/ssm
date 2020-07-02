package ssm.test.controller;
/*
* 账户web
* */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ssm.test.domain.Account;
import ssm.test.service.AccountService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class accountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("表现层：查询所有账户。。。");

        List<Account> list =  accountService.findAll();

        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {

        accountService.saveAccount(account);

        response.sendRedirect(request.getContextPath()+"/account/findAll");

        return ;
    }

    @RequestMapping("/delete")
    public void delete(Integer id) throws IOException {
        accountService.Delete(id);
        return ;
    }

}
