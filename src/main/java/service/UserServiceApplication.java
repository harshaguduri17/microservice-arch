import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// ... import your User and UserRepository classes

@SpringBootApplication
@EnableEurekaClient
@RestController
public class UserServiceApplication {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable Long id) {
        // ... fetch user from database

    }
}