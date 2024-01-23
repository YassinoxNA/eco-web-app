package nachate.net.inventoryservice.repository;

import nachate.net.inventoryservice.entites.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,String> {
}
