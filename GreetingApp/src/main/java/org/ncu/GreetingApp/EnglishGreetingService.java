package org.ncu.GreetingApp;

import org.ncu.GreetingApp.fortune.FortuneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("engGreeting")
public class EnglishGreetingService implements GreetingService{
	
	
	FortuneService fortune;
	
	
	
	@Autowired
	public EnglishGreetingService(@Qualifier("englishFortuneService") FortuneService fortune) { 
		this.fortune = fortune; 
	}
	 
	public void greet(String name) {
		System.out.println("Hello, "+name);
		
	}

	@Override
	public void fortune(String name) {
		
	
		fortune.tellFortune(name);
	}
}