
package com.gudias.dao.jpa;

import com.gudias.dao.generic.jpa.GenericJpaDAO;
import com.gudias.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
