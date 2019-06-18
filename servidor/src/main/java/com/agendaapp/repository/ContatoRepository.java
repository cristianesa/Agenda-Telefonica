package com.agendaapp.repository;

import com.agendaapp.agendaapp.models.Contato;

public interface ContatoRepository extends CrudRepository <Contato, String> {
	Contato findByCodigo(long codigo);
	Contato save(Contato contato);
	Iterable<Contato> findAll();
}
