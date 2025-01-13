package com.example.ecommerceapp.repository;

import com.example.ecommerceapp.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Message, Long> {

}
