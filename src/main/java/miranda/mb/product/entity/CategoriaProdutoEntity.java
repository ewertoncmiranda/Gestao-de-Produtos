package miranda.mb.product.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CATEGORIA_TBL")
public class CategoriaProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    private String nome ;

    @OneToMany
    @JoinColumn(name = "categoria_produto")
    private List<ProdutoEntity> produtos;


}
