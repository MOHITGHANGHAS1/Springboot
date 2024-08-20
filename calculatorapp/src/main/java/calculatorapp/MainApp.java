package calculatorapp;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter first number");
      int x=sc.nextInt();
      System.out.println("Enter second number");
      int y=sc.nextInt();
      FactoryCalculatorApp Factory = new FactoryCalculatorApp();
      
      System.out.println("enter operation you want to perform ");
      System.out.println(" ");
      System.out.println("Enter + for additon - for subtraction * for multiplication / for divison");
		char o= sc.next().charAt(0);

      
      MathService b = Factory.getMathService(o);
      double c =b.operation(x, y);
		System.out.println(c);
		sc.close();

	}

}
