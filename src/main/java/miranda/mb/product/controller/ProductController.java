package miranda.mb.product.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import miranda.mb.product.dto.ProductDTO;
import miranda.mb.product.service.ProductService;

@RestController
@RequestMapping(value = "/produto")
@Api (value = "API REST DE CADASTRO DE PRODUTOS")
@CrossOrigin(origins="*")
public class ProductController {
	
	@Autowired
	ProductService service ;
	
	@PostMapping
	public ResponseEntity<ProductDTO> saveProduct(@RequestBody ProductDTO produtodto){
	return ResponseEntity.ok().body(service.saveProduct(produtodto));	
	}
	
	@GetMapping
	public ResponseEntity<List<ProductDTO>> getAllProducts(){
	return ResponseEntity.ok(service.getAllProducts());	
	}	
	
	@GetMapping(value = "/create")
	public ResponseEntity<ProductDTO> createProduct(){
	ProductDTO dto = new ProductDTO(10L, "Produto Teste", new BigDecimal(100),new BigDecimal(85));
	return ResponseEntity.ok(dto);		
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProductDTO> productById(@PathVariable Long id) {
	return ResponseEntity.ok(service.productById(id));		
	}
	
	@PutMapping
	public ResponseEntity<ProductDTO> updateProduct(@RequestBody ProductDTO produtodto){
	return ResponseEntity.ok(service.updateProduct(produtodto));	
	}
	
	@DeleteMapping
	public ResponseEntity<Boolean> deleteProduct(@RequestBody ProductDTO produtodto){
	return ResponseEntity.ok(service.deleteProduct(produtodto.getId()));	
	}
	
	

}
