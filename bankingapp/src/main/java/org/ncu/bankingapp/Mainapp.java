package org.ncu.bankingapp;

import org.ncu.bankingapp.AnnotationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	SavingAccount savingaccount = context.getBean(SavingAccount.class);
    	savingaccount.deposit();
	}

}
