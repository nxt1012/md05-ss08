package com.rikkeiacademy.cms.service;

import com.rikkeiacademy.cms.model.Customer;

public interface ICustomerService {
    boolean insertWithStoredProcedure(Customer customer);
}