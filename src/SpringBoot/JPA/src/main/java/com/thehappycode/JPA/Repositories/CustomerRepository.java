package com.thehappycode.JPA.Repositories;

import com.thehappycode.JPA.Entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Long> {

    // TODO: Link
    // https://docs.spring.io/spring-data/jpa/reference/repositories/query-keywords-reference.html?utm_source=chatgpt.com
    // https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html?utm_source=chatgpt.com

    // TODO: Spring Data JPA hiểu theo tên method có convention
    // findBy<PropertyName> -> SELECT ... WHERE propertyName = ?

    // findById -> SELECT ... WHERE Id = ?
    CustomerEntity findById(long id);

    // findByFirstName -> SELECT ... WHERE firstName = ?
    List<CustomerEntity> findByFirstName(String firstName);

    // findByFirstNameAndLastName -> SELECT ... WHERE firstName = ? AND lastName = ?
    CustomerEntity findByFirstNameAndLastName(String firstName, String lastName);
}
