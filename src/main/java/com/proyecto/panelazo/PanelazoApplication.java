package com.proyecto.panelazo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )
public class PanelazoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PanelazoApplication.class, args);
	}

}