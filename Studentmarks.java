package com.codegnan.oopmethods;

import java.util.Scanner;

public class Studentmarks {
	String name;
	int[] marks;
	
	
	public void setDetails(String s, int[] m) {
		this.name=s;
		this.marks=m;
	}

	public int calculateTotal() {
		int total=0;
		for(int mark: marks) {
			total+=mark;
		}
		return total;
	}
	
	public double calculateAverage() {
		int total = calculateTotal();
		return (double) total/marks.length;
	}

	public void displayDetails() {
		System.out.println("Student Name: "+this.name);
        System.out.println("Total Marks: " + this.calculateTotal());
        System.out.println("Average of Marks: " + this.calculateAverage());

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
	    String name = sc.nextLine();
		
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        
        int[] marks = new int[n];
        for(int i=0;i<n;i++) {
        	marks[i]=sc.nextInt();
        }
        
        Studentmarks s = new Studentmarks();
        s.setDetails(name, marks);
        s.displayDetails();
		sc.close();
	}

}
