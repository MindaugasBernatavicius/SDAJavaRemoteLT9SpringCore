package cf.mindaugas._06_javaconfig.repository;

import cf.mindaugas._06_javaconfig.model.Customer;

import java.util.ArrayList;
import java.util.List;

// @Repository
public class InMemoryCustomerRepository implements CustomerRepository {
    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstname("Jonas from memory");
        customer.setLastname("Jonaitis");
        customers.add(customer);
        return customers;
    }
}