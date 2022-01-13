package com.learning.CRMWebAppRestClient.service;

import com.learning.CRMWebAppRestClient.model.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId);

    public void deleteCustomer(int theId);
}

