package com.codegnan.oopmethods;

import java.util.Scanner;

public class GadgetHub {
	int[] prices; // instance variable to store item prices
	
    // Constructor to initialize prices	
	public GadgetHub(int[] prices) {
		this.prices=prices;
	}
	
	public static int calculateTotal(int[] prices) {
		int sum=0;
		for(int price: prices) {
			sum+=price;
		}
        // Validation: total should not exceed 10000
		if(sum>10000) {
			return 0;
		}
		return sum;
	}
	
    // Non-static method to update item price
	public int updatePrice(int index, String category) {
		if(index <0 || index>=prices.length) {
			System.out.println("Invalid Index");
			return 0;
		}
		int updatePrice = prices[index];
		
		if(category.equalsIgnoreCase("electronics")) {
			updatePrice = (int) ( prices[index] * 1.1);
		} else if (category.equalsIgnoreCase("appliances")) {
			updatePrice = (int) ( prices[index] * 1.2);
		}
		
		if(updatePrice > 10000) {
			updatePrice = 10000;
		}
		
		return updatePrice;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int index = sc.nextInt();
		String category = sc.next();
		
		int total = calculateTotal(arr);
		
		GadgetHub g = new GadgetHub(arr);
		
		int updated = g.updatePrice(index, category);
		
		System.out.println(total+" "+updated);
		sc.close();
	}

}
