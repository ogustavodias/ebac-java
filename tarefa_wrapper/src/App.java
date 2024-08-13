import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int primitiva = in.nextInt();
        Integer wrapper = primitiva;
        System.out.println("O número digitado foi: " + wrapper);

        in.close();
    }
}
