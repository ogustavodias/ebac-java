import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        printAverage();
    }

    public static void printAverage() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        float n1 = in.nextFloat();
        System.out.println("Digite o segundo número: ");
        float n2 = in.nextFloat();
        System.out.println("Digite o terceiro número: ");
        float n3 = in.nextFloat();
        System.out.println("Digite o quarto número: ");
        float n4 = in.nextFloat();

        float average = (n1 + n2 + n3 + n4) / 4;
        System.out.println("A média dos números digitados é " + average);

        in.close();
    }
}
