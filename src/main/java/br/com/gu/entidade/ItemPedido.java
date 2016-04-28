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
@Table(name = "itens_pedidos")
public class ItemPedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@Column(nullable = false,  name = "valor_unitario")
	private BigDecimal valorUnitario;
	

	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false)
	private Produto produto;
	

	@ManyToOne
	@JoinColumn(name = "pedido_id", nullable = false)
	private Pedido pedido;
	

	
	
	
	
	
	public ItemPedido() {
		super();
	}

	public ItemPedido(Integer quantidade, BigDecimal valorUnitario, Produto produto, Pedido pedido) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;// = this.getProduto().getValorUnitario();
		this.produto = produto;
		this.pedido = pedido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valorUnitario) {
//		valorUnitario = this.getProduto().getValorUnitario();
		this.valorUnitario = valorUnitario;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

//	@Override
//	public String toString() {
//		return (produto + " Quantidade: " + quantidade + " Valor: " + valorUnitario + "\n");
//	}
}
