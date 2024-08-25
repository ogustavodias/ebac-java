public class HighCostCarFactory implements IFactory {
  @Override
  public ICar createCar() {
    return new HighCostCar();
  }
}
