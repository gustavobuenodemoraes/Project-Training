package br.com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "treinamento")
public class Treinamento extends GenericDomain {

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Exercicio exercicio;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Professor professor;
	
	@ManyToOne
	private OrdemTreino ordem;
	
	@Column
	private String serie;
	
	@Column
	private Double repetiaco;
	
	@Column
	private Double carga;

	public Exercicio getExercicio() {
		return exercicio;
	}

	public void setExercicio(Exercicio exercicio) {
		this.exercicio = exercicio;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public OrdemTreino getOrdem() {
		return ordem;
	}

	public void setOrdem(OrdemTreino ordem) {
		this.ordem = ordem;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

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
}