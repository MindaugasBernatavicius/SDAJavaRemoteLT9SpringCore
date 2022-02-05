package cf.mindaugas._02_di_interfaces_nospring.repository;

import cf.mindaugas._02_di_interfaces_nospring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}