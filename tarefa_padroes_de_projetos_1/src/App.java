public class App {
    public static void main(String[] args) throws Exception {
        IFactory factory;

        String typeOfCar = "High";

        if (typeOfCar.equals("Low"))
            factory = new LowCostCarFactory();
        else
            factory = new HighCostCarFactory();

        Client client = new Client(factory);
        client.init();
    }
}
