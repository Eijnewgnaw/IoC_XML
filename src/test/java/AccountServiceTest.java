import Account.Service.Service;
import Account.Service.impl.ImpAccountService;
import Account.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountServiceTest {

    @Test
    public void testFindAll(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Service service = applicationContext.getBean("AccountService", ImpAccountService.class);
        List<Account> accounts=service.findAllAccount();
        for(Account account:accounts){
            System.out.println(account);
        }
    }

    @Test
    public void testFindOne(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Service service = applicationContext.getBean("AccountService", ImpAccountService.class);
        Account account = service.findAccountById(1);
        System.out.println(account);
    }

    @Test
    public void testSave(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Service service = applicationContext.getBean("AccountService", ImpAccountService.class);
        Account account = new Account();
        account.setName("ddd");
        account.setMoney(1000);
        service.saveAccount(account);
    }

    @Test
    public void testUpdate(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Service service = applicationContext.getBean("AccountService", ImpAccountService.class);
        Account account = service.findAccountById(1);
        account.setMoney(12345f);
        service.updateAccount(account);
    }

    @Test
    public void testDelete(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Service service = applicationContext.getBean("AccountService", ImpAccountService.class);
        service.deleteAccount(5);
    }
}
