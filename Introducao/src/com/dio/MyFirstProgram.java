package com.dio;

import com.dio.base.Order;

public class MyFirstProgram {
	public static void main(String[] args) {
		
		Order order = new Order("code1234", 99);
		
		System.out.println(order);
	}
}
