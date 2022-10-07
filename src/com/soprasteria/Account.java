package com.soprasteria;

import java.util.Random;

public class Account {
	
	private Random r = new Random();
	private int idCount = r.nextInt(1000) + 1;
	private String owner;
	private float money = 0;
	
	//Constructors
	
	public Account(String owner) {
		this.owner = owner;
	}
	
	
	//Getters
	
	public float getMoney() {
		return money;
	}
	public String getOwner() {
		return owner;
	}
	public int getIdCount() {
		return idCount;
	}
	
	//Setters
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//Other Methods
	
	public void addToAccount(int moneyToAdd) {
		money += moneyToAdd;
	}
	
	public int withdrawFromAccount(float moneyToWithdraw) {
		int check = -1;
		if(money > moneyToWithdraw) {
			check = 0;
			money -= moneyToWithdraw;
		}
		return check;
	}
	
}
