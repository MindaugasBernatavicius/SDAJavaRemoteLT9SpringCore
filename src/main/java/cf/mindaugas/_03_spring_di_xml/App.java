package cf.mindaugas._03_spring_di_xml;

import cf.mindaugas._03_spring_di_xml.repository.InMemoryCustomerRepository;
import cf.mindaugas._03_spring_di_xml.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // DatabaseCustomerRepository dr = new DatabaseCustomerRepository();
        // InMemoryCustomerRepository dr = new InMemoryCustomerRepository();
        // System.out.println(new CustomerService(dr).findAll());

        // System.out.println(new CustomerService().findAll()); // NPE
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = appCtx.getBean("customerService", CustomerService.class);
        System.out.println(service.findAll());
    }
}



