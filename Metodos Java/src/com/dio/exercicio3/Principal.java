package com.dio.exercicio3;

public class Principal {
	public static void main(String[] args) {
		System.out.println("***** Exerc�cio retornos *****");
		double areaQuadrado = Quadrilatero.area(5);
		System.out.println("�rea do quadrado: " + areaQuadrado);
		
		double areaRetangulo = Quadrilatero.area(5d, 5d);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);
		
		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("�rea do trap�zio: " + areaTrapezio);
		
		double areaLosango = Quadrilatero.area(5f, 5f);
		System.out.println("�rea do losango: " + areaLosango);
	}
}
