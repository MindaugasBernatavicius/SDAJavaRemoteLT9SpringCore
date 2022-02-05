package cf.mindaugas._06_javaconfig;

import cf.mindaugas._06_javaconfig.repository.CustomerRepository;
import cf.mindaugas._06_javaconfig.repository.DatabaseCustomerRepository;
import cf.mindaugas._06_javaconfig.repository.InMemoryCustomerRepository;
import cf.mindaugas._06_javaconfig.service.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// @Configuration
// @ComponentScan({"cf.mindaugas._06_javaconfig"})
// class AppConfig {
//     @Bean(name = "customerRepository")
//     public CustomerRepository getCustomerRepository(){
//         // return new InMemoryCustomerRepository();
//         return new DatabaseCustomerRepository();
//     }
//     @Bean(name = "customerService")
//     public CustomerService getCustomerService(){
//         return new CustomerService();
//     }
// }
//
// public class App {
//     public static void main(String[] args) {
//         // ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext-annotations.xml");
//         // CustomerService service = appCtx.getBean("customerService", CustomerService.class);
//         // System.out.println(service.findAll());
//
//         ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
//         CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
//         System.out.println(service1.findAll());
//     }
// }

@Configuration
@ComponentScan({"cf.mindaugas._06_javaconfig"})
public class App {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(App.class);
        CustomerService service1 = appContext.getBean("customerService", CustomerService.class);
        System.out.println(service1.findAll());
    }
}




