package miranda.mb.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Entity
@Table(name="TB_PRODUTO")
@AllArgsConstructor
@Data
public class ProdutoEntity implements Serializable {

	private static final long serialVersionUID = -3439733765134033925L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	
	private String nome ;
	private BigDecimal quantidade;
	private BigDecimal valor ;

	@OneToOne
	private CategoriaProdutoEntity categoria ;

	
	
}
