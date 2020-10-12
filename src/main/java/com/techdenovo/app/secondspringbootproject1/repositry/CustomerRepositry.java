package com.techdenovo.app.secondspringbootproject1.repositry;

import com.techdenovo.app.secondspringbootproject1.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositry extends JpaRepository<Customer,Long> {
}
