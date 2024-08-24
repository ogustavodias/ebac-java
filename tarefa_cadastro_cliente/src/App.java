import domains.dao.ClienteMapDAO;
import domains.models.Cliente;
import ui.DialogUtils;

public class App {
    public static void main(String[] args) throws Exception {
        ClienteMapDAO lista = new ClienteMapDAO();

        String menuOption = DialogUtils.showInputDialog(DialogUtils.getMenuOptions());

        while (menuOption != null && !menuOption.equals(DialogUtils.OPTION_SAIR)) {

            switch (menuOption) {
                case DialogUtils.OPTION_CADASTRAR:
                    String nome = DialogUtils.showInputDialog("Nome do cliente");
                    String cpf = DialogUtils.showInputDialog("CPF do cliente");
                    String telefone = DialogUtils.showInputDialog("Telefone do cliente");
                    String endereco = DialogUtils.showInputDialog("Endereço do cliente");

                    Boolean sucesso = lista.adicionar(new Cliente(cpf, nome, telefone, endereco));
                    String message = sucesso ? "O cliente foi cadastrado com sucesso!"
                            : "Não foi possível cadastrar o cliente, verifique se ele já não está cadastrado.";
                    DialogUtils.showMessageDialog(message, sucesso);
                    break;

                case DialogUtils.OPTION_REMOVER:
                    Boolean success = lista
                            .remover(DialogUtils.showInputDialog("Informe o CPF do cliente que será removido."));
                    DialogUtils.showMessageDialog("", success);
                    break;

                case DialogUtils.OPTION_BUSCAR:
                    Cliente cliente = lista
                            .buscar(DialogUtils.showInputDialog("Informe o CPF do cliente que deseja encontrar."));

                    DialogUtils.showMessageDialog(cliente != null ? cliente.toString() : "", cliente != null,
                            cliente != null ? "Cliente encontrado." : "Cliente não encontrado");
                    break;
                case DialogUtils.OPTION_LISTAR:
                    Boolean isEmpty = lista.tamanho() > 0;
                    DialogUtils.showMessageDialog(lista.toString(), isEmpty,
                            isEmpty ? "Lista de clientes." : "Não há clientes cadastrados.");
                    break;
                default:
                    DialogUtils.showMessageDialog("Opção inválida!", false);
                    break;
            }

            menuOption = DialogUtils.showInputDialog(DialogUtils.getMenuOptions());
        }

        System.exit(0);
    }
}
