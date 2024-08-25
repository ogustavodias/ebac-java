public class LowCostCar implements ICar {

  @Override
  public void clean() {
    System.out.println("Your low-cost car has been cleaned.");
  }

  @Override
  public void fillFuel() {
    System.out.println("Your low-cost car's fuel has been filled.");
  }

  @Override
  public void startEngine() {
    System.out.println("The engine of your low-cost car has started.");
  }

}
