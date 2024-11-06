
package com.gudias.dao;

import com.gudias.dao.generic.jpa.GenericJpaDAO;
import com.gudias.dao.jpa.IVendaJpaDAO;
import com.gudias.domain.jpa.VendaJpa;
import com.gudias.exceptions.DAOException;
import com.gudias.exceptions.TipoChaveNaoEncontradaException;

/**
 * Classe utilizada somente no teste para fazer a exclusão das vendas
 */
public class VendaExclusaoJpaDAO extends GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

	public VendaExclusaoJpaDAO() {
		super(VendaJpa.class);
	}

	@Override
	public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

	@Override
	public VendaJpa consultarComCollection(Long id) {
		throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
	}

}
