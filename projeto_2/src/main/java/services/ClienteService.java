/**
 * 
 */
package main.java.services;

import main.java.dao.IClienteDAO;
import main.java.domain.Cliente;
import main.java.exceptions.TipoChaveNaoEncontradaException;
import main.java.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	// private IClienteDAO clienteDAO;

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		// this.clienteDAO = clienteDAO;
	}

	// @Override
	// public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException
	// {
	// return clienteDAO.cadastrar(cliente);
	// }

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}

	// @Override
	// public void excluir(Long cpf) {
	// clienteDAO.excluir(cpf);
	// }
	//
	// @Override
	// public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException{
	// clienteDAO.alterar(cliente);
	// }

}
