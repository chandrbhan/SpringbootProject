import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.shubham")
@EntityScan(basePackages = "com.shubham")
@Configuration
@EnableJpaRepositories(basePackages = "com.shubham")
public class OrganizationApplication {
    public static  void main(String[] args){
        SpringApplication.run(OrganizationApplication.class);
    }
}

