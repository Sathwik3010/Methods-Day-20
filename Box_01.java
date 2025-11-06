package com.codegnan.oopprograms;

public class Box_01 {
	static double height; // instance variables
	static double depth;
	static double width;

	public Box_01() {
		super();
	}

//	public Box_01(double height, double depth, double width) {
//		super();
//		this.height = height;
//		this.depth = depth;
//		this.width = width;
//	}

	public static double volume() {
//	System.out.print("Volume is: ");
//	System.out.println(height * width * depth);
		return height * width * depth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box_01 mybox1 = new Box_01(2.0, 3.0, 5.0);
		System.out.println(volume());
	}

}
