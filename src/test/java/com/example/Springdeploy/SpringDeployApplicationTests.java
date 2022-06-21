package com.example.Springdeploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		//ver las variables de entorno del system con un forEach y duncion flecha
		System.getenv().forEach(
				(key, value) -> System.out.println(key + " " + value)
		);
	}

}
