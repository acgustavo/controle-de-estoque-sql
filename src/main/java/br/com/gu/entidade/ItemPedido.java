package br.com.gu.entidade;

public class ItemPedido {
	private Long id;
	private Integer quantidade;
	private Double valorUnitario;
	private Produto produto;
	private long produtoid;
	private Pedido pedido;
	private long pedidoid;

	public ItemPedido() {
		super();
	}

	public ItemPedido(Integer quantidade, Double valorUnitario, long produtoid, long pedidoid) {
		super();
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;// = this.getProduto().getValorUnitario();
		this.produtoid = produtoid;
		this.pedidoid = pedidoid;
	}

	public long getProdutoid() {
		return produtoid;
	}

	public void setProdutoid(long produtoid) {
		this.produtoid = produtoid;
	}

	public long getPedidoid() {
		return pedidoid;
	}

	public void setPedidoid(long pedidoid) {
		this.pedidoid = pedidoid;
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

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		valorUnitario = this.getProduto().getValorUnitario();
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

	@Override
	public String toString() {
		return (produto + " Quantidade: " + quantidade + " Valor: " + valorUnitario + "\n");
	}
}
