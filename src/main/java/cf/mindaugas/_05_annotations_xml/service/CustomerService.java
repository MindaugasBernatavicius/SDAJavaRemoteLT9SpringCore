package cf.mindaugas._05_annotations_xml.service;

import cf.mindaugas._05_annotations_xml.model.Customer;
import cf.mindaugas._05_annotations_xml.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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