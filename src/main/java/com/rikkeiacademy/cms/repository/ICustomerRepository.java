package com.rikkeiacademy.cms.repository;

import com.rikkeiacademy.cms.model.Customer;

public interface ICustomerRepository {
    boolean insertWithStoredProcedure(Customer customer);
}