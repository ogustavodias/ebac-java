public class App {
    public static void main(String[] args) throws Exception {
        Pessoa fisica = new PessoaFisica("Gustavo", "Rua sem saída", "999.999.999-99", "04/09/2000");
        Pessoa juridica = new PessoaJuridica("GLOBAL HEALTH LTDA", "37 E. Victoria St", "99.999.999/0001-74",
                "01/01/1990");
        printPessoa(fisica);
        printPessoa(juridica);
    }

    public static void printPessoa(Pessoa pessoa) {
        System.out.println(pessoa);
    }
}
