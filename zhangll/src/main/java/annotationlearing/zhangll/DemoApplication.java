package annotationlearing.zhangll;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import annotationlearing.zhangll.transaction.service.AccountService;

@SpringBootApplication
@ComponentScan(basePackages = { "annotationlearing/zhangll/transaction", "classpath:*" })
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
