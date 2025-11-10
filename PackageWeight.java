package com.codegnan.oopmethods;

import java.util.Scanner;

public class PackageWeight {
	static int totalWeight;
	
	public static int calculateTotalWeight(int [] weights) {
		int sum=0;
		
		for(int w: weights) {
			if(w<0) {
                System.out.println("Invalid weight detected.");
                return 0;
			}
			sum+=w;
		}
		if(sum>10000) {
			sum=10000;
		}
		totalWeight = sum;
		return totalWeight;
	}
	
	public int adjustPackageWeight(int[] weights, int index, String type) {
		if(index < 0 || index >=weights.length) {
			 System.out.println("Invalid index.");
	         return 0;
		}
		
		int weight = weights[index];
        double adjusted = 0;

        if(type.equalsIgnoreCase("standard")) {
        	adjusted = weight * 1.5;
        } else if(type.equalsIgnoreCase("heavy")) {
        	adjusted = weight * 2;
        } else {
        	System.out.println("Invalid package type.");
            return 0;
        }
        
        if (adjusted > 10000) {
            adjusted = 10000; // cap individual weight
        }

        return (int)adjusted;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] weights = new int[n];
        
        for(int i=0;i<n;i++) {
        	weights[i]=sc.nextInt();
        }
        
        int index = sc.nextInt();
        String type = sc.next();
        
        int total = calculateTotalWeight(weights);
        
        PackageWeight pw = new PackageWeight();
        int adjusted =pw.adjustPackageWeight(weights, index, type);
        
        System.out.println(total+" "+adjusted);
        sc.close();
	}

}
