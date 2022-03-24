package khvci.northwind.dataAccess.abstracts;

import khvci.northwind.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {

}
