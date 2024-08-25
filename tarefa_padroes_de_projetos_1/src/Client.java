public class Client {
  private ICar car;

  public Client(IFactory factory) {
    this.car = factory.createCar();
  }

  public void init() {
    this.car.clean();
    this.car.fillFuel();
    this.car.startEngine();
  }
}
