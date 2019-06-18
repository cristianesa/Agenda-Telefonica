package com.agendaapp.agendaapp.models;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Contato implements Serializable{
	
	private static final long serialVersionUID = 1l;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigo;

	private String nome;
	private String sobrenome;
	private String apelido;
	private String email;
	private int celular;
	
	@OneToMany
	private List<Cliente> cliente;
	
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
}



