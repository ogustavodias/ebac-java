public class App {
    public static void main(String[] args) throws Exception {
        Lista<Carro> list = new Lista<>();
        Carro honda = new Honda("Branco", "Automático", "CIVIC", 2020, 35, 110);
        Carro toyota = new Toyota("Branco", "Automático", "COROLA", 2020, 35, 110);
        list.register(toyota);
        list.register(honda);
        list.printAll();
    }
}
