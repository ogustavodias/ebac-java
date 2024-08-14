import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(
                "Olá, seja bem vindo!\nSerá necessário digitar 4 notas para obter a média do aluno e validar a situação do mesmo.");
        init();
    }

    public static void init() {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float n1 = in.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float n2 = in.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float n3 = in.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float n4 = in.nextFloat();

        float average = (n1 + n2 + n3 + n4) / 4;
        String approval = checkApproval(average);

        System.out.println("A média deste aluno é de " + average + ", portanto: " + approval);

        in.close();
    }

    public static String checkApproval(float score) {
        if (score >= 7)
            return "Aprovado";
        else if (score >= 5)
            return "Recuperação";
        else
            return "Reprovado";
    }
}
