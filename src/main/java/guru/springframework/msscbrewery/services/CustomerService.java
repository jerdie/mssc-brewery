package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getById(UUID id);
    CustomerDto createCustomer(CustomerDto customerDto);
    void updateCustomer(UUID id, CustomerDto customerDto);
    void deleteCustomer(UUID id);
}
