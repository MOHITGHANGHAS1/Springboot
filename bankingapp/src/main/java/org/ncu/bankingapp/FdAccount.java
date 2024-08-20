package org.ncu.bankingapp;

import org.springframework.stereotype.Component;

@Component
public class FdAccount implements Accounts {
	public void deposit(){
		System.out.println("Cash Deposited");
	}
	public void Balance() {}
	}


