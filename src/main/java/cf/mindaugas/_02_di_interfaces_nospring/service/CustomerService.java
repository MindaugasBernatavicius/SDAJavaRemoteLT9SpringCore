package cf.mindaugas._02_di_interfaces_nospring.service;

import cf.mindaugas._02_di_interfaces_nospring.model.Customer;
import cf.mindaugas._02_di_interfaces_nospring.repository.CustomerRepository;

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

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}