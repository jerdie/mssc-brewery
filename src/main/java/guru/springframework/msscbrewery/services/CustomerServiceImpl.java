package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getById(UUID id) {
        return CustomerDto.builder()
                .id(id)
                .name("customer").build();
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("G")
                .build();
    }


    @Override
    public void updateCustomer(UUID id, CustomerDto customerDto) {

    }

    @Override
    public void deleteCustomer(UUID id) {

    }
}
