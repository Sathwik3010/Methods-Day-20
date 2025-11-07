package com.codegnan.oopmethods;

import java.util.Scanner;

public class FineTracker {
	private static int totalFines = 0;
	private int[] patronFines;
	
	
	public FineTracker(int[] fines) {
//		super();
		this.patronFines = fines;
		for(int f: fines) {
			totalFines+=f;
		}
	}
	
	public static void updateTotalFines(int finesToAdd) {
		if(finesToAdd<0) {
            System.out.println("Invalid input! Fines cannot be negative.");
            return;
		}
		if(totalFines + finesToAdd <=100) {
			totalFines+=finesToAdd;
		} else {
            System.out.println("Total fines cannot exceed 100.");
		}
	}

	public void updatePatronFine(int index, int finesToAdd) {
		if(finesToAdd<0) {
            System.out.println("Invalid input! Fines cannot be negative.");
            return;
		}
		if(index<0 || index>=patronFines.length) {
			 System.out.println("Invalid patron index!");
	         return;
		}
		if(patronFines[index]+ finesToAdd <=100) {
            patronFines[index] += finesToAdd;
            totalFines+=finesToAdd;
		}else {
            System.out.println("Patron fine cannot exceed 100. Update ignored.");
		}
	}
	
	public static int getTotalFines() {
		return totalFines;
		
	}
	
	public void displayPatronFines() {
		for(int f:patronFines) {
			System.out.println(f+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter number of patrons");
       int n = sc.nextInt();
       int[] fines = new int[n];
       
       for(int i=0;i<n;i++) {
    	   fines[i]=sc.nextInt();
       }
       
       System.out.println("patron index to update");
       int index = sc.nextInt(); 
       
       System.out.println("fines to add to total");
       int staticFines = sc.nextInt();
       
       System.out.println("fines to add for patron");
       int instanceFines = sc.nextInt();
       
       FineTracker tracker = new FineTracker(fines);
       
       FineTracker.updateTotalFines(staticFines);
       
       tracker.updatePatronFine(index, instanceFines);
       
       System.out.println(FineTracker.getTotalFines());
       tracker.displayPatronFines();
       
       sc.close();
	}
	
	

}
