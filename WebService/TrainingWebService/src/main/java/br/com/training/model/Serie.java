package br.com.training.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Serie implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Column
	private Double repetiaco;
	
	@Column
	private Double carga;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Treinamento treinamento;

	public Double getRepetiaco() {
		return repetiaco;
	}

	public void setRepetiaco(Double repetiaco) {
		this.repetiaco = repetiaco;
	}

	public Double getCarga() {
		return carga;
	}

	public void setCarga(Double carga) {
		this.carga = carga;
	}

	public Treinamento getTreinamento() {
		return treinamento;
	}

	public void setTreinamento(Treinamento treinamento) {
		this.treinamento = treinamento;
	}
}
