/**
 * 
 */
package br.com.nome.dao;

import br.com.nome.domain.Produto;
import br.com.nome.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ProdutoDaoMock implements IProdutoDAO {

	@Override
	public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {

		return true;
	}

	@Override
	public void excluir(String valor) {

		
	}

	@Override
	public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {

	}

	@Override
	public Produto consultar(String valor) {
		Produto produto = new Produto();
		produto.setCodigo(valor);
		return produto;
	}

	@Override
	public Collection<Produto> buscarTodos() {

		return null;
	}

	@Override
	public Class<Produto> getTipoClasse() {
		return null;
	}

	@Override
	public void atualizarDados(Produto entity, Produto entityCadastrado) {

	}
}
