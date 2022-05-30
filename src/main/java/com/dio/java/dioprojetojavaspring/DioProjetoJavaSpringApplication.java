package com.dio.java.dioprojetojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class DioProjetoJavaSpringApplication {

	public static void main(String[] args) {

		SpringApplication.run(DioProjetoJavaSpringApplication.class, args);
	}

}
