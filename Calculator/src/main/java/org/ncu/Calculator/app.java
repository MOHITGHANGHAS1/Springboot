package org.ncu.Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class app {
 public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(Annotationconfig.class);

     Calculator calculator = context.getBean(Calculator.class);
     calculator.compute("add", 1, 2);
     
     calculator.compute("subtract", 3, 3);
     
     
     calculator.compute("multiply", 4, 5);
     
     calculator.compute("divide",6, 7);
 }
}



