package test;

import org.junit.Assert;
import org.junit.Test;

import dao.Contrato;
import dao.ContratoDAO;
import dao.IContratoDAO;
import dao.mocks.ContratoDaoMock;
import service.ContratoService;
import service.IContratoService;

public class ContratoServiceTest {

    @Test
    public void salvarTest() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest() {
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTeste() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        Contrato retorno = service.buscar(0);
        Assert.assertTrue(retorno instanceof Contrato);
    }

    @Test
    public void excluirTeste() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.excluir(0);
        Assert.assertTrue(retorno);
    }

    @Test
    public void atualizarTeste() {
        IContratoDAO dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        boolean retorno = service.atualizar(0);
        Assert.assertTrue(retorno);
    }
}
