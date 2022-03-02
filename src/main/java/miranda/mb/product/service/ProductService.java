package miranda.mb.product.service;

import java.util.ArrayList;
import java.util.List;

import miranda.mb.product.entity.ProdutoEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import miranda.mb.product.dto.ProductDTO;
import miranda.mb.product.repositorios.ProdutoRepositoryJPA;


@Service
public class ProductService {

	@Autowired
	ProdutoRepositoryJPA produtoRepositorio ;
	
	ModelMapper mapeador = new ModelMapper();
		
	/** Retorna uma lista de ProductDTO **/
	public List<ProductDTO> getAllProducts(){
	  List<ProductDTO> lista = new ArrayList<>();	
	    for( ProdutoEntity pro : produtoRepositorio.findAll()) {
	    	lista.add(mapeador.map(pro, ProductDTO.class));
	    }	
	    return lista ;	
	}
	
	public ProductDTO productById( Long id){
	 return mapeador.map(produtoRepositorio.findById(id).orElseThrow(NullPointerException::new), ProductDTO.class);
	}
	
	public ProductDTO saveProduct(ProductDTO produtoDto) {
		ProdutoEntity produtoEntity = mapeador.map(produtoDto, ProdutoEntity.class);
		ProdutoEntity produtoEntitySalvo = produtoRepositorio.save(produtoEntity);
		return mapeador.map(produtoEntitySalvo, ProductDTO.class);
	}
	
	public Boolean deleteProduct(Long id) {
		if(produtoRepositorio.findById(id).isPresent()) {
			produtoRepositorio.delete(produtoRepositorio.findById(id).get());
			return true ;
		}else {
			return false ;
		}
	}
		
	public ProductDTO updateProduct(ProductDTO produto) {		    
		if(produtoRepositorio.findById(produto.getId()).isPresent()) {
          return mapeador.map( produtoRepositorio.save(
        		  mapeador.map(produto , ProdutoEntity.class)) , ProductDTO.class);
		}else {
			return null ;
		}				
	}
	
}
