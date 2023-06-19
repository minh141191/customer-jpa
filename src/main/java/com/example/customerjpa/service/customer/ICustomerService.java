package com.example.customerjpa.service.customer;

import com.example.customerjpa.model.Customer;
import com.example.customerjpa.model.Province;
import com.example.customerjpa.service.IGeneralService;

public interface ICustomerService extends IGeneralService<Customer> {
    Iterable<Customer> findAllByProvince(Province province);
}
