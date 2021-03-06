package br.com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "musculo")
public class Musculo extends GenericDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(length = 100, nullable = false)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
