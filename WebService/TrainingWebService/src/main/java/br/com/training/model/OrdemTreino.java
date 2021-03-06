package br.com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ordemTreinamento")
public class OrdemTreino extends GenericDomain{

	private static final long serialVersionUID = 1L;

	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 400)
	private String descricao;
}
