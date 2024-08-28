public abstract class Carro {

  public static final int WHEELS = 4;
  private String color;
  private String transmission;
  private String model;
  private int year;
  private int fuelcap;
  private int horsepower;

  protected Carro(String color, String transmission, String model, int year, int fuelcap, int horsepower) {
    this.color = color;
    this.transmission = transmission;
    this.model = model;
    this.year = year;
    this.fuelcap = fuelcap;
    this.horsepower = horsepower;
  }

  public abstract void accelerate();

  public String getColor() {
    return color;
  }

  public String getTransmission() {
    return transmission;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public int getFuelcap() {
    return fuelcap;
  }

  public int getHorsepower() {
    return horsepower;
  }

  @Override
  public String toString() {
    return "Modelo: " + this.model;
  };

}