package de.spiller.maven.services.impl;

import java.util.ArrayList;
import java.util.Collection;

import de.spiller.maven.entities.Customer;
import de.spiller.maven.services.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Collection<Customer> list() {
        return new ArrayList<>();
    }

}
