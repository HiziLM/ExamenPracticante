package com.practicante.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.practicante.model.Cliente;
import com.practicante.repository.ClienteRepository;

@Service
public class ClienteRepositoryImp implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Override
	public Cliente registrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Optional<Cliente> get(String idCliente) {
		return clienteRepository.findById(idCliente);
	}

	@Override
	public void update(Cliente cliente) {
		clienteRepository.save(cliente);
		
	}

	@Override
	public void delete(String idCliente) {
		clienteRepository.deleteById(idCliente);
		
	}

}
