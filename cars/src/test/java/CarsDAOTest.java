import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.CarDAO;
import domain.Accessory;
import domain.Brand;
import domain.Car;

public class CarsDAOTest {

  @Test
  public void register() {
    Brand brand = new Brand("BMW");
    Accessory accessory = new Accessory("sunroof", new BigDecimal(3000.00));
    List<Accessory> accessories = new ArrayList<>();
    accessories.add(accessory);
    Car car = new Car("320I", brand, accessories);
    CarDAO carDAO = new CarDAO();
    Long idBD = carDAO.register(car);

    assertEquals(idBD, car.getId());
  }

}