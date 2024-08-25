public class HighCostCar implements ICar {

  @Override
  public void clean() {
    System.out.println("Your high-cost car has been cleaned.");
  }

  @Override
  public void fillFuel() {
    System.out.println("Your high-cost car's fuel has been filled.");
  }

  @Override
  public void startEngine() {
    System.out.println("The engine of your high-cost car has started.");
  }

}
