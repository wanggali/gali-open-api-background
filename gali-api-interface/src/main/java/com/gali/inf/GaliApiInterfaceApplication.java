package com.gali.inf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class GaliApiInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GaliApiInterfaceApplication.class, args);
	}

}
