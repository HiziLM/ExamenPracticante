package com.practicante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicante.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, String>{

}
