package com.codegnan.oopmethods;

import java.util.Scanner;

public class AttendeeTracker {
	private static int totalAttendees=0;
	private int eventAttendees=0;
	
	public static void updateTotalAttendees(int count) {
		if(count<0) {
            System.out.println("Invalid input! Attendees cannot be negative.");
		} 
		if(totalAttendees + count <=300) {
			totalAttendees+=count;
		} else {
            System.out.println("Total attendees cannot exceed 300.");
		}
	}
	
	public void updateEventAttendees(int count) {
		if(count<0) {
            System.out.println("Invalid input! Attendees cannot be negative.");
		}
		if(this.eventAttendees + count <=300) {
			this.eventAttendees += count;
		} else {
            System.out.println("Event attendees cannot exceed 300.");
		}
	}
	
	public static int getTotalAttendees() {
		return totalAttendees;
	}
	
	public  int geteventAttendees() {
		return this.eventAttendees;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Attendees:");
		int staticAttendees = sc.nextInt();
		System.out.println("Enter Event Attendees:");
		int instanceAttendees = sc.nextInt();
		
		AttendeeTracker.updateTotalAttendees(staticAttendees);
		
		AttendeeTracker at = new AttendeeTracker();
		at.updateEventAttendees(instanceAttendees);
		
		System.out.println(AttendeeTracker.getTotalAttendees()+" "+at.geteventAttendees());
		sc.close();
	}

}
