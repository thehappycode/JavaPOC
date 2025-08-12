package com.thehappycode.JPA.Repositories;

import com.thehappycode.JPA.Entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {
    CustomerEntity findById(long id);
    List<CustomerEntity> findByFirstName(String firstName);
}
