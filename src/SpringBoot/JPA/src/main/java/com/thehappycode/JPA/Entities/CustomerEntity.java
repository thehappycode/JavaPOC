package com.thehappycode.JPA.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Annotation @Entity để khai báo nó là một JPA Entity.
public class CustomerEntity {

    @Id // Annotation @Id để JPA nhận biết nó là ID của đối tượng.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String firstName;
    private  String lastName;

    // TODO: Default Constructor làm việc với JPA.
    // Bạn không nên làm việc trực tiếp với nó.
    // Do đó tôi gán cho nó access modifier là protected.
    protected CustomerEntity() {

    }

    public CustomerEntity(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer{id=%d, firstName='%s', lastName='%s'}",
                id, firstName, lastName);
    }
}
