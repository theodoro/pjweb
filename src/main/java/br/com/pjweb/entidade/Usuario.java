package br.com.pjweb.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbusuario")
public class Usuario {
	
	@Id
	@SequenceGenerator(name="seq_usu", initialValue=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_usu")
	private Long id;
	@Column(nullable=false, length=55)
	private String nome;
	@Column(nullable=false, length=55)
	private String email;
	@Column(nullable=false, length=55)
	private String senha;
	
	public Usuario() {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
