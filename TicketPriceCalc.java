package com.codegnan.oopprograms;

import java.util.Scanner;

public class TicketPriceCalc {
	int tickets;
	
	
	public TicketPriceCalc(int tickets) throws Exception{
		if(tickets<0) {
			throw new Exception("Ticket cannot be nagative");
		}
		this.tickets = tickets;
	}

	public double calculateAmount() {
		return tickets*500.0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter number of tickets");
		int count=sc.nextInt();
//		if(count<0) {
//			System.out.println("Ticket count should not be negative");
//			return;
//		}
		TicketPriceCalc tb = new TicketPriceCalc(count);
		System.out.println(tb.calculateAmount());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}
	}

}
