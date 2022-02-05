package cf.mindaugas._06_javaconfig.service;

import cf.mindaugas._06_javaconfig.model.Customer;
import cf.mindaugas._06_javaconfig.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public CustomerService() {}
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}