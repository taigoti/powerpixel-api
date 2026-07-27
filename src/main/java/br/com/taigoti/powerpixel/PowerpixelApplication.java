package br.com.taigoti.powerpixel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PowerpixelApplication {

	public static void main(String[] args) {
		SpringApplication.run(PowerpixelApplication.class, args);
	}

}
