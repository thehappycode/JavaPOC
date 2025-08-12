package com.thehappycode.JPA;

import com.thehappycode.JPA.Entities.CustomerEntity;
import com.thehappycode.JPA.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    @Autowired
    private  CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

    @Bean
    public CommandLineRunner runner(){
        return args -> {

            // TODO: Initial Customers
            initialCustomers();

            // TODO: fetch all customers
            findAll();

            // TODO: fetch an individual customer by ID = 1
            findById(1);

            // TODO: fetch customers by last name = Kim
            findFirstName("Kim");

            // TODO: fetch and update an individual customer by firstName = David and lastName = Palmer
            findByFirstNameAndLastName("David", "Palmer");

            // TODO: Update Customer David -> David1, Palmer -> Palmer1
            updateCustomer(new CustomerEntity(3, "David1", "Paler1"));

            // TODO: Delete Customer have id = 2
            deleteCustomer(2);

            // TODO: fetch all customers
            findAll();
        };
    }

    // TODO: save a few customers
    private void initialCustomers() {
        customerRepository.save(new CustomerEntity("Jack", "Bauer"));
        customerRepository.save(new CustomerEntity("Chloe", "O'Brian"));
        customerRepository.save(new CustomerEntity("Kim", "Bauer"));
        customerRepository.save(new CustomerEntity("David", "Palmer"));
        customerRepository.save(new CustomerEntity("Michelle", "Dessler"));
    }

    // TODO: fetch all customers
    private void findAll() {
        System.out.println("-> Customers found with findAll()");
        customerRepository.findAll()
                .forEach(customer -> {
                    System.out.println(customer.toString());
                });
        System.out.println();
    }

    // TODO: fetch an individual customer by ID
    private void findById(long id){
        System.out.println("-> Customer found with findById(1L)");
        CustomerEntity customer = customerRepository
                .findById(id);
        System.out.println(customer.toString());
        System.out.println();
    }

    // TODO: fetch customers by last name
    private void findFirstName(String firstName) {
        System.out.println("-> Customer found with findByFirstName('Kim')");
        customerRepository.findByFirstName(firstName)
                .forEach(customer -> {
                    System.out.println(customer.toString());
                });
        System.out.println();
    }

    // TODO: fetch an individual customer by firstName and lastName
    private void findByFirstNameAndLastName(String firstName, String lastName)
    {
        System.out.println("-> Customer found with findByFirstNameAndLastName('David', 'Palmer')");
        var customer = customerRepository
                .findByFirstNameAndLastName(firstName, lastName);
        System.out.println(customer.toString());
        System.out.println();
    }

    // TODO: Update an individual customer
    private void updateCustomer(CustomerEntity input) {

        System.out.println("-> Update Customer ${input.toString()}");
        CustomerEntity customer = customerRepository
                .findById(input.getId());
        customer.setFirstName(input.getFirstName());
        customer.setLastName(input.getLastName());
        customerRepository.save(customer);
        System.out.println(customer.toString());
        System.out.println();
    }

    // TODO: Delete an individual customer by Id
    private  void deleteCustomer(long id){
        System.out.println("-> Delete Customer with Id = ${id}");
        CustomerEntity customer = customerRepository.findById(id);
        customerRepository.delete(customer);
        System.out.println();
    }
}
