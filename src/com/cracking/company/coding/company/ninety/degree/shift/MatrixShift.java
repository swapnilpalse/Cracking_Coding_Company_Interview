package com.cracking.company.coding.company.ninety.degree.shift;

import java.util.Scanner;

public class MatrixShift {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of the 2d array.");
		int n=scanner.nextInt();
		int originalArray[][]=new int[n][n];
		System.out.println("Enter 2 D Array");
		for(int i=0;i<n;i++){
			System.out.println("Enter row"+i);
			for(int j=0;j<n;j++){
				originalArray[i][j]=scanner.nextInt();
			}
		}
		System.out.println("***********************Ninety degree shift*************************");
		int newArray[][]=new int[n][n];
		int temp=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				temp=originalArray[i][j];
				originalArray[i][j]=originalArray[n-1-j][i];
				originalArray[n-1-j][i]=temp;
				System.out.print(originalArray[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
