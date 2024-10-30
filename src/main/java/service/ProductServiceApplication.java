import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// ... import your Product and ProductRepository classes

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ProductServiceApplication {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id) {
        // ... fetch product from database
    }
}