package br.org.generation.sistemaalunoecurso.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity					//curso é uma entidade
@Table(name="tblcurso") //cujo nome da tabela foi definido
public class Curso {
	
	@Id          //CodCurso é a chave primaria
	@GeneratedValue(strategy=GenerationType.IDENTITY) // gerado pelo banco
	@Column(name="id") // nome da coluna
	private int id;
	@Column(name="nome", length=100) // aqui definimos nome e tamanho da coluna
	private String nome;
	@Column(name="area", length=100)
	private String area;
	@Column(name="modalidade", length=30)
	private String modalidade;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "curso")
	@JsonIgnoreProperties("curso")
	private List<Aluno> aluno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public List<Aluno> getAluno() {
		return aluno;
	}
	public void setAluno(List<Aluno> aluno) {
		this.aluno = aluno;
	}

	
}
