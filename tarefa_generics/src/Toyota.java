public class Toyota extends Carro {

  public static final String BRAND = "TOYOTA";

  public Toyota(String color, String transmission, String model, int year, int fuelcap, int horsepower) {
    super(color, transmission, model, year, fuelcap, horsepower);
  }

  @Override
  public void accelerate() {
    System.out.println("Você acelerou seu " + BRAND);
  }

  @Override
  public String toString() {
    return "Marca: " + BRAND + " | " + super.toString();
  }
}
