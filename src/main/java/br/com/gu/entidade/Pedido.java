package br.com.gu.entidade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Pedido {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column( name = "data_criacao")
	@Temporal(TemporalType.DATE)
	private Calendar dataCriacao;
	
	
	private String observacao;
	
	@Column( name = "data_entrega")
	@Temporal(TemporalType.DATE)
	private Calendar dataEntrega;
	
	@Column(  name = "valor_frete")
	private BigDecimal valorFrete;
	
	@Column(name = "valor_desconto")
	private BigDecimal valorDesconto;
	
	@Column(name = "valor_total")
	private BigDecimal valorTotal;
	
	@Enumerated(EnumType.STRING)
	private StatusPedido status;
	
	
	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario vendedor;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "endereco_id", nullable = false)
	private Endereco enderecoEntrega;
	
	@OneToMany(mappedBy = "pedido", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();


	
	
	
	
	public Pedido() {
		super();
	}

	public Pedido(Calendar dataCriacao, String observacao, Calendar dataEntrega, BigDecimal valorFrete, BigDecimal valorDesconto,
			StatusPedido status, Usuario vendedor, Cliente cliente, Endereco enderecoEntrega) {
		super();
		this.dataCriacao = dataCriacao;
		this.observacao = observacao;
		this.dataEntrega =dataEntrega;
		this.valorFrete = valorFrete;
		this.valorDesconto = valorDesconto;
		this.status = status;
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.enderecoEntrega = enderecoEntrega;
	}

	
	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getValorFrete() {
		return valorFrete;
	}

	public void setValorFrete(BigDecimal valorFrete) {
		this.valorFrete = valorFrete;
	}

	public BigDecimal getValorDesconto() {
		return valorDesconto;
	}

	public void setValorDesconto(BigDecimal valorDesconto) {
		this.valorDesconto = valorDesconto;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}

	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	

}
