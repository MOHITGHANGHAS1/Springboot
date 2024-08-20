package org.ncu.Calculator;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Annotationconfig {

	 @Bean
	 public MathService AdditionService() {
	     return new AdditionService();
	 }

	 @Bean
	 public MathService SubtractionService() {
	     return new SubtractionService();
	 }

	 @Bean
	 public MathService MultiplicationService() {
	     return new MultiplicationService();
	 }

	 @Bean
	 public MathService DivisionService() {
	     return new divisionService();
	 }

	 @Bean
	 public Calculator calculator(
	         MathService AdditionService,
	         MathService SubtractionService,
	         MathService MultiplicationService,
	         MathService DivisionService) {
	     return new Calculator(AdditionService, SubtractionService, MultiplicationService, DivisionService);
	 }

}

