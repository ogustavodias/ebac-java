import java.util.Scanner;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) throws Exception {
        printInitialMessage();
        initProgram();
    }

    public static void initProgram() {
        Scanner in = new Scanner(System.in);
        ListaPessoas lista = new ListaPessoas();

        System.out.println("Digite a lista de pessoas conforme orientações inicial: ");
        String[] csv = in.nextLine().split(",");

        for (String pessoa : csv) {
            String[] separatedInfo = pessoa.split("-");

            if (separatedInfo.length < 2)
                continue;

            String nome = separatedInfo[0].trim();
            String sexo = separatedInfo[1].trim();

            if (Pessoa.isValidMale(sexo) || Pessoa.isValidFemale(sexo))
                lista.addPessoa(new Pessoa(nome, sexo));
        }

        // Anterior, sem uso de lambda e stream.

        /*
         * System.out.println("\nLista de pessoas do sexo Masculino: \n" +
         * lista.getMale() + "\n");
         * System.out.println("Lista de pessoas do sexo Feminino: \n" +
         * lista.getFemale() + "\n");
         */

        System.out.println("\nLista de pessoas do sexo Masculino:");
        lista.getAll().stream().filter(p -> Pessoa.isValidMale(p.getSexo()))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Lista de pessoas do sexo Feminino:");
        lista.getAll().stream().filter(p -> Pessoa.isValidFemale(p.getSexo()))
                .forEach(System.out::println);
        System.out.println();
        
        System.out.println(
                "Caso algum item não tenha sido exibido, certifique-se que a lista foi digitada conforme a orientação inicial do programa.");

        in.close();
    }

    public static void printInitialMessage() {
        System.out.println("Olá, seja bem vindo!\n");
        System.out.println("Este programa tem como objetivo separar uma lista de pessoas por sexo.\n");
        System.out.println("Lembretes:");
        System.out.println("- cada pessoa deve ser separada por vírgula.");
        System.out.println("- o nome e sexo de uma pessoa devem ser separados por um hífen.");
        System.out.println("- o sexo de uma pessoa pode ser M, Masculino, F ou Feminino.\n");
    }
}
