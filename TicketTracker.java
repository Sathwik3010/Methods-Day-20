package com.codegnan.oopmethods;

import java.util.Scanner;

public class TicketTracker {

	private static int totalTickets = 0;
	private int[] concertTickets;
	
	public TicketTracker(int[] tickets) {
		this.concertTickets = tickets;
		for(int t: tickets) {
			totalTickets+=t;
		}
	}
	
	public static void updateTotalTickets(int ticketsToAdd) {
		if(ticketsToAdd<0) {
			System.out.println("Invalid input! Tickets cannot be negative.");
			return;
		}
		if(totalTickets + ticketsToAdd<=5000) {
			totalTickets+=ticketsToAdd;
		} else {
            System.out.println("Total tickets cannot exceed 5000.");
		}
	}
	
	public void updateConcertTickets(int index, int ticketsToAdd) {
		if(ticketsToAdd<0) {
			System.out.println("Invalid input! Tickets cannot be negative.");
			return;
		}
		if(index < 0 || index >=concertTickets.length) {
            System.out.println("Invalid concert index!");
            return;
		}
		if(concertTickets[index] + ticketsToAdd<=5000) {
			concertTickets[index] +=ticketsToAdd;
			totalTickets+=ticketsToAdd;
		}else {
            System.out.println("Concert tickets cannot exceed 5000.");
		}
	}
	
	public static int getTotalTickets() {
		return totalTickets;
	}
	
	public void displayConcerts() {
		for(int t:concertTickets) {
			System.out.println(t+ " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of concerts");
		int n = sc.nextInt();
		int[] tickets = new int[n];
		
		for(int i=0;i<n;i++) {
			tickets[i]=sc.nextInt();
		}
		
		System.out.println("concert index to update");
		int index = sc.nextInt();
		
		System.out.println("tickets to add to total");
		int staticTickets = sc.nextInt();
		
		System.out.println("tickets to add to concert");
		int instanceTickets = sc.nextInt();
		
		TicketTracker tracker = new TicketTracker(tickets);
		
		TicketTracker.updateTotalTickets(staticTickets);
		
		tracker.updateConcertTickets(index, instanceTickets);
		
		System.out.println(TicketTracker.getTotalTickets());
		tracker.displayConcerts();
		sc.close();
	}

}
