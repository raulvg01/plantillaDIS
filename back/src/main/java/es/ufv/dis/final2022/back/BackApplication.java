package es.ufv.dis.final2022.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackApplication.class, args);

		// escribe por consola
		System.out.println("Hola mundo");
		//bucle escriba numeros de 1  a 10
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}
