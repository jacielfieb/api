package br.belval.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.belval.api.model.Produto;


public interface ProdutoRepository extends CrudRepository <Produto, Integer>{
	
	/*List<Produto> findByNomeContainingOrDescricaoContaining(String texto2);*/
	List<Produto> findByNomeContainingOrDescricaoContaining(String nome,String descricao);
	
}


