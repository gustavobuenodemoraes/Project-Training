package br.com.training.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exercicio")
public class Exercicio extends GenericDomain{
	
	private static final long serialVersionUID = 1L;
	
	@Column(length = 100, nullable = false)
	private String nome;
	
	@Column(length = 400)
	private String descricao;
	
	@Column(length = 200)
	private String linkVideo;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Musculo musculoPrincipal;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Musculo musculoSinergistal;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Equipamento equipamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getLinkVideo() {
		return linkVideo;
	}

	public void setLinkVideo(String linkVideo) {
		this.linkVideo = linkVideo;
	}

	public Musculo getMusculoPrincipal() {
		return musculoPrincipal;
	}

	public void setMusculoPrincipal(Musculo musculoPrincipal) {
		this.musculoPrincipal = musculoPrincipal;
	}

	public Musculo getMusculoSinergistal() {
		return musculoSinergistal;
	}

	public void setMusculoSinergistal(Musculo musculoSinergistal) {
		this.musculoSinergistal = musculoSinergistal;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
}
