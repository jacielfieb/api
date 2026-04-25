package br.belval.api.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.belval.api.model.Produto;
import br.belval.api.repository.ProdutoRepository;

@RestController
public class ProdutoController {
	
	private ProdutoRepository repository;
	
	
	//curl POST http://localhost:8080/produtos -H "Content-Type: application/json; Charset=utf-8" -d @produto-pao.json
	@PostMapping("/produtos")
	public ResponseEntity<Produto> criarProduto(@RequestBody Produto produto) {
		
		produto.setDataCriacao(LocalDateTime.now());
		System.out.println("Chegou : " + produto.toString());
		
		
		repository.save(produto);
		
		return ResponseEntity
				.status(HttpStatus.CREATED)
				.body(produto);
	}

}
