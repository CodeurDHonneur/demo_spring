package service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.highfive.demo.domain.Customer;
import com.highfive.demo.repository.CustomerRepository;

@Service
public class CustomerService extends CrudService<Customer, Long> {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    public Customer create(Customer customer) {
        if(customerRepository.existsByPhone(customer.getPhone())) {
            throw new IllegalArgumentException("Le numéro '" + customer.getPhone() + "' est déjà attribué à un client");
        }
        return super.create(customer);
    }

    public Optional<Customer> getName(String name) {
        return customerRepository.findByName(name);
    }

    public Optional<Customer> getPhone(String phone) {
        return customerRepository.findByPhone(phone);
    }
}
