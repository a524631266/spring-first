package annotationlearing.zhangll;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import annotationlearing.zhangll.config.TransactionConfig;
import annotationlearing.zhangll.transaction.pojo.Person;
import annotationlearing.zhangll.transaction.service.AccountService;

// @RunWith(SpringRunner.class)
// @SpringBootTest
public class TransactionTest {
    public AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(TransactionConfig.class);

    @Test
    public void testTransaction() {
        AccountService ad = (AccountService) aca.getBean("accountService");
        Person payer = new Person("jack", 1000);
        Person payee = new Person("rose", 1000);
        ad.transfer(payer, payee, 1000);
    }

    public static void main(String[] args) {
        TransactionTest a = new TransactionTest();
        a.testTransaction();
    }
}