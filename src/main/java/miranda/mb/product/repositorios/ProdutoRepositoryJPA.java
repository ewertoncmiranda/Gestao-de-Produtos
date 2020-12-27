package miranda.mb.product.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import miranda.mb.product.models.Produto;

@Repository
public interface ProdutoRepositoryJPA  extends JpaRepository<Produto,Long>{

}
