import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import dao.SaleDAO;
import domain.Customer;
import domain.Product;
import domain.Sale;

public class SaleDAOTest {

  @Test
  public void register() {
    Customer customer = new Customer("Gustavo Dias");
    Product product = new Product("guitar", new BigDecimal(3000.00));
    List<Product> products = new ArrayList<>();
    products.add(product);
    Sale sale = new Sale("C01", customer, products);
    SaleDAO saleDAO = new SaleDAO();
    Long idBD = saleDAO.register(sale);

    assertEquals(idBD, sale.getId());
  }

}
