package org.ncu.GreetingApp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp 
{
    public static void main( String[] args )
    {
		
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	
    	
    	GreetingService service = context.getBean("frenchGreetingService", GreetingService.class);
    
    	
    	service.greet("Mohit");
    	
    	
    	context.close();
    }
}
