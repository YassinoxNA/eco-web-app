package nachate.net.inventoryservice;

import nachate.net.inventoryservice.entites.Product;
import nachate.net.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().
                    id(UUID.randomUUID().toString())
                    .name("Computer").price(3200).quantity(12)
                    .build());

            productRepository.save(Product.builder().
                    id(UUID.randomUUID().toString())
                    .name("Printer").price(1200).quantity(11)
                    .build());

            productRepository.save(Product.builder().
                    id(UUID.randomUUID().toString())
                    .name("Smart phone ").price(1100).quantity(10)
                    .build());
        };

    }
}
