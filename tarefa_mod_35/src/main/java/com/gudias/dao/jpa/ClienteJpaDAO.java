
package com.gudias.dao.jpa;

import com.gudias.dao.generic.jpa.GenericJpaDAO;
import com.gudias.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
