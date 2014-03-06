package br.com.pjweb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbcadastrogeral")
public class Cadastro {
	
	@Id
	@SequenceGenerator(name="seq_cad", initialValue=1)
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_cad")
	private Long id;
	@Column(nullable=false, length=55)
	private String nome;
	@Column(nullable=false, length=55)
	private String email;
	@Column(nullable=false, length=15)
	private String cpf;
	
	public Cadastro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	

}
