package com.example.sp5ch07;

import controller.ExeTimeCalculator;
import controller.ImpeCalculator;
import controller.RecCalculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sp5Ch07Application {

	public static void main(String[] args) {

		SpringApplication.run(Sp5Ch07Application.class, args);

		ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
		System.out.println(ttCal1.factorial(20));

		ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
		System.out.println(ttCal2.factorial(20));
	}

}
