package com.codegnan.oopmethods;

import java.util.Scanner;

public class TicketDiscount {
	static int totalDiscount;
	
	public static int calculateTotalDiscount(int [] prices) {
		int sum=0;
		
		for(int price: prices) {
			if(price<0) {
                System.out.println("Invalid price detected.");
                return 0;
			}
			sum+=price;
		}
		int discount = (int) (sum * 0.10);
		totalDiscount = discount;
		return totalDiscount;
	}
	
	public int calculateTicketDiscount(int []prices, int index, String ticketType) {
		if(index<0 || index>=prices.length) {
            System.out.println("Invalid index.");
            return 0;
		}
		
		int price = prices[index];
		double discount=0;
		
		if(ticketType.equalsIgnoreCase("early")) {
			discount = price * 0.20;
		} else if(ticketType.equalsIgnoreCase("regular")) {
			discount = price * 0.05;
		} else {
			System.out.println("Invalid ticket type.");
            return 0;
		}
		
		if(discount>1000) {
			discount = 1000;
		}
		return (int)discount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]prices = new int[n];
		
		for(int i=0;i<n;i++) {
			prices[i]=sc.nextInt();
		}
		
		int index = sc.nextInt();
		String ticketType = sc.next();
		
		int totalDisc = calculateTotalDiscount(prices);
		
		TicketDiscount td = new TicketDiscount();
		int instanceDisc = td.calculateTicketDiscount(prices, index, ticketType);
		
		System.out.println(totalDisc + " " +instanceDisc);
		sc.close();
	}

}
