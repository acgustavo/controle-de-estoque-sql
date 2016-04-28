package br.com.gu.entidade;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Produto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false, unique = true)
	private String sku;
	
	@Column(nullable = false,  name = "valor_unitario")
	private BigDecimal valorUnitario;

	@Column(nullable = false,  name = "quantidade_estoque")
	private int quantidadeEstoque;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;


	
	
	
	
	public Produto() {
		super();
	}

	public Produto(String nome, String sku, BigDecimal valorUnitario, int quantidadeEstoque) {
		super();
		this.nome = nome;
		this.sku = sku;
		this.valorUnitario = valorUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
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

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

//	@Override
//	public String toString() {
//		return ("Produto: " + nome + " " + sku + " Valor unitario: "
//				+ valorUnitario /*
//								 * + " Quantidade em estoque: " +
//								 * quantidadeEstoque + categoria
//								 */);
//	}

}
