package org.ncu.bankingapp;

import org.springframework.stereotype.Component;

@Component
public class CheckingAccount implements Accounts {
    public void deposit(){
	System.out.println("Cash Deposited");}
	public void Balance() {
		System.out.println("Current balance");
	}
}

