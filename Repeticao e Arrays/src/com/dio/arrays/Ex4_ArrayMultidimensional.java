package com.dio.arrays;

import java.util.Random;
/*
 * Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */

public class Ex4_ArrayMultidimensional {
	public static void main(String[] args) {
		Random random = new Random();
		int[][] M = new int[4][4]; 
		
		for (int i = 0; i < M.length; i++)
			for(int j = 0; j < M[i].length; j++) //tamanho da linha que ta sendo percorrida
				M[i][j] = random.nextInt(9);
		/*
		 * for normal
		for (int i = 0; i < M.length; i++) {
			for(int j = 0; j < M[i].length; j++) 
				System.out.print(M[i][j] + "\t");
			System.out.println();
		}
		*/
		
		for(int[] linha : M) {
			for(int coluna : linha)
				System.out.print(coluna + "\t");
			System.out.println();
		}
	}
}
