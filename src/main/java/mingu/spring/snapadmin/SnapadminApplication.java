package mingu.spring.snapadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tech.ailef.snapadmin.external.SnapAdminAutoConfiguration;

@EnableCaching
@ImportAutoConfiguration(SnapAdminAutoConfiguration.class)
@SpringBootApplication
public class SnapadminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnapadminApplication.class, args);
    }

}
