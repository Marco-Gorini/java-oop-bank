package com.soprasteria;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Account userAccount;
		
		System.out.print("Write your name: ");
		userAccount = new Account(in.nextLine());
		while(true) {
			System.out.println("You have three options:\n - Add (write 'add')\n - Withdraw(write 'withdraw')\n - Exit(write 'exit')");
			String command = in.nextLine();
			if(command.equalsIgnoreCase("add")) {
				System.out.print("Write the money to add: ");
				int moneyToAdd = in.nextInt();
				in.nextLine();
				userAccount.addToAccount(moneyToAdd);
				System.out.println("You have " + userAccount.getMoney() + " $ in your account");
			}
			else if(command.equalsIgnoreCase("withdraw")) {
				System.out.print("Write the money to withdraw: ");
				int moneyToWithdraw = in.nextInt();
				in.nextLine();
				if(userAccount.withdrawFromAccount(moneyToWithdraw) == - 1) {
					System.out.println("You have not enought money!.");
				}
				else {
					System.out.println("You have " + userAccount.getMoney() + " $ in your account");
				}
			}
			else {
				break;
			}
		}
		
	}
}
