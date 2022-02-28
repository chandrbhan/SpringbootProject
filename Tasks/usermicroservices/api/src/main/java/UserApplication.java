import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.dubey.example")
@EntityScan(basePackages = "com.dubey.example")
@Configuration
@EnableJpaRepositories(basePackages = "com.dubey.example")
public class UserApplication {
    public static  void main(String[] args){
        SpringApplication.run(UserApplication.class);
    }
}
