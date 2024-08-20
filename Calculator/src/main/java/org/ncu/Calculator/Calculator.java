package org.ncu.Calculator;
import java.util.Scanner;

public class Calculator {
	MathService AdditionService;
	MathService SubtractionService;
	MathService MultiplicationService;
	MathService DivisionService;

	public Calculator(MathService AdditionService, MathService SubtractionService, MathService MultiplicationService,
			MathService DivisionService) {
		this.AdditionService = AdditionService;
		this.SubtractionService = SubtractionService;
		this.MultiplicationService = MultiplicationService;
		this.DivisionService = DivisionService;
	}

	public void compute(String operation, int x, int y) {
		switch (operation) {
		case "add":
			AdditionService.operate(x, y);
			break;
		case "subtract":
			SubtractionService.operate(x, y);
			break;
		case "multiply":
			MultiplicationService.operate(x, y);
			break;
		case "divide":
			DivisionService.operate(x, y);
			break;
		default:
			throw new IllegalArgumentException("Invalid operation: " + operation);
		}
	}
}
