package com.medico.community.medicocommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin(origins = "*")
@EntityScan(basePackages = {"com.medico.community.*"})
@EnableJpaRepositories(basePackages = {"com.medico.community.*"})
public class MedicoCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicoCommunityApplication.class, args);
    }

}
