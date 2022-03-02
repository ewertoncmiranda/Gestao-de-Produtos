package miranda.mb.product.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import miranda.mb.product.entity.ProdutoEntity;

@Repository
@Transactional
public interface ProdutoRepositoryJPA  extends JpaRepository<ProdutoEntity,Long>{

}
