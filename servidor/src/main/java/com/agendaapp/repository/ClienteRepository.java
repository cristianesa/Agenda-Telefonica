package com.agendaapp.repository;

import com.agendaapp.agendaapp.models.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
	Cliente save(Cliente cli);
}
