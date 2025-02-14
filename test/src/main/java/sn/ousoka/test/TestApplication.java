package sn.ousoka.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);

		System.out.println("La calculatrice est démarrée");
		
		Calculator calculator = new Calculator();
		System.out.println("2 + 2 = " + calculator.add(2, 2));
		System.out.println("2 - 2 = " + calculator.subtract(2, 2));
		System.out.println("2 * 2 = " + calculator.multiply(2, 2));
	}

}
