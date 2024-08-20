package FactoryPattern;

public class French implements greetingservice{
    String name;
    
    public void greet(String name) {
  	  System.out.println("Bonjour"+name);
    }
}

