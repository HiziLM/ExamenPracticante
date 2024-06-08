package com.practicante.service;

import java.util.Optional;

import com.practicante.model.Cliente;

public interface ClienteService {

	public Cliente registrar(Cliente cliente);
	public Optional<Cliente> get(String idCliente);
	public void update(Cliente cliente);
	public void delete(String idCliente);
	
}
