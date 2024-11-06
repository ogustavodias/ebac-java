package com.gudias.dao;

import com.gudias.dao.generic.IGenericDAO;
import com.gudias.domain.Venda;
import com.gudias.exceptions.DAOException;
import com.gudias.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
