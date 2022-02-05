package cf.mindaugas._03_spring_di_xml.service;

import cf.mindaugas._03_spring_di_xml.model.Customer;
import cf.mindaugas._03_spring_di_xml.repository.CustomerRepository;
import cf.mindaugas._03_spring_di_xml.repository.InMemoryCustomerRepository;

import java.util.List;

public class CustomerService {
    // private DatabaseCustomerRepository customerRepository;
    // public CustomerService(DatabaseCustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }
    // private InMemoryCustomerRepository customerRepository;
    // public CustomerService(InMemoryCustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // public void setCustomerRepository(CustomerRepository customerRepository) {
    //     this.customerRepository = customerRepository;
    // }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}