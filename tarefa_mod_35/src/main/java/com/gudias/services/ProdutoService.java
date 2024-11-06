
package com.gudias.services;

import com.gudias.dao.IProdutoDAO;
import com.gudias.domain.Produto;
import com.gudias.services.generic.GenericService;


public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}

}
