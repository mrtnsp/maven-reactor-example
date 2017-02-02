package de.spiller.maven.services;

import java.util.Collection;

import de.spiller.maven.entities.Customer;

/**
 * this is just an example.
 *
 * @author mspiller
 *
 */
public interface CustomerService {

    Collection<Customer> list();
}
