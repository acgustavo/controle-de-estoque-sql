package br.com.gu.entidade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false, name = "documento_receita_federal", unique = true)
	private String documentoReceitaFederal;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoPessoa tipo;
	
	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<Endereco>();

	
	
	
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String email, String documentoReceitaFederal, TipoPessoa tipo) {
		super();
		this.nome = nome;
		this.email = email;
		this.documentoReceitaFederal = documentoReceitaFederal;
		this.tipo = tipo;
	}

	public TipoPessoa getTipo() {
		return tipo;
	}

	public void setTipo(TipoPessoa tipo) {
		this.tipo = tipo;
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

	public String getDocumentoReceitaFederal() {
		return documentoReceitaFederal;
	}

	public void setDocumentoReceitaFederal(String documentoReceitaFederal) {
		this.documentoReceitaFederal = documentoReceitaFederal;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	
//	@Override
//	public String toString() {
//		return ("Pessoa " + tipo + ", " + nome + " Numero de registro: " + documentoReceitaFederal + " Email: " + email);
//	}

}
