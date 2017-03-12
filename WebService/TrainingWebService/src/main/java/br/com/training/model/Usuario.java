package br.com.training.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuario")
public class Usuario extends GenericDomain{

	private static final long serialVersionUID = 1L;
	
	@Column(length=70, nullable = false)
	private String nome;
	
	@Column(length=70, nullable = false)
	private String email;
	
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	
	@Column(length=32, nullable = false)
	private String senha;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}