package cf.mindaugas._02_di_interfaces_nospring;

import cf.mindaugas._02_di_interfaces_nospring.repository.DatabaseCustomerRepository;
import cf.mindaugas._02_di_interfaces_nospring.repository.InMemoryCustomerRepository;
import cf.mindaugas._02_di_interfaces_nospring.service.CustomerService;

public class App {
    public static void main(String[] args) {
        // DatabaseCustomerRepository dr = new DatabaseCustomerRepository();
        InMemoryCustomerRepository dr = new InMemoryCustomerRepository();
        System.out.println(new CustomerService(dr).findAll());
    }
}



