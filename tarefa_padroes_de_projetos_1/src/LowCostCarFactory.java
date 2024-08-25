public class LowCostCarFactory implements IFactory {
  @Override
  public ICar createCar() {
    return new LowCostCar();
  }
}
