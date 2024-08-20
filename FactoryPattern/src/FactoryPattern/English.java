package FactoryPattern;

public class English implements greetingservice{
      String name;
      
      public void greet(String name) {
    	  System.out.println("Hello"+name);
      }
}
