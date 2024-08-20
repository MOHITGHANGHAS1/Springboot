package org.ncu.GreetingApp.fortune;

public interface FortuneService {
	public void tellFortune(String name);
	
	default String tellZodiac() {
		
		return "Scorpian";
	}
	
	default int tellNumber() {
		
		return 0;
	}
}
