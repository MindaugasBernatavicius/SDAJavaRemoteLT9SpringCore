package cf.mindaugas._06_javaconfig.repository;

import cf.mindaugas._06_javaconfig.model.Customer;

import java.util.List;

public interface CustomerRepository {
    public List<Customer> findAll();
}