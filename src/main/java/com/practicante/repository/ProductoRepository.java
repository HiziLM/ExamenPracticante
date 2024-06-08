package com.practicante.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicante.model.Producto;

public interface ProductoRepository  extends JpaRepository<Producto, String>{

}
