package io.github.bharatmane.banking.services;

import io.github.bharatmane.banking.entity.Customer;

import java.util.List;

public class BankingService {
    private final List<Customer> customers;

    public BankingService(List<Customer> customers) {
        this.customers = customers;
    }

    public int getCustomerCount() {
        return customers.size();
    }
}
