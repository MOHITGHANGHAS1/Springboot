package FactoryPattern;
import java.util.Scanner;
public class greet {

	public static void main(String[] args) {
		System.out.println("Enter name: ");
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();

		FactoryGreetingService factory = new FactoryGreetingService();
		greetingservice g = factory.getGreetingService("french");

		g.greet(n);
		sc.close();

	}

}
