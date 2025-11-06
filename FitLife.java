package com.codegnan.oopmethods;

import java.util.Scanner;

public class FitLife {
	int steps;
	
	public FitLife(int steps) {
		this.steps=steps;
	}
	
	public void displayMessage() {
		if(this.steps>10000) {
			System.out.println("Excellent!");
		} else if(this.steps>=500 && this.steps<=10000) {
			System.out.println("Good job!");	
		} else {
			System.out.println("Keep going!");	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Steps");
		int n = sc.nextInt();
		
		FitLife fl = new FitLife(n);
		fl.displayMessage();
		sc.close();
	}

}
