package miranda.mb.product.dto;

import java.math.BigDecimal;

public class ProductDTO {

	private long id ;	
	private String nome ;
	private BigDecimal quantidade;
	private BigDecimal valor ;
	
	public ProductDTO() {};
	
	public ProductDTO(long id, String nome, BigDecimal quantidade, BigDecimal valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	

}
