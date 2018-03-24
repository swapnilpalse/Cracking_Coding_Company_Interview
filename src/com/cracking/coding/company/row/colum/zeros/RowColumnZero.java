package com.cracking.coding.company.row.colum.zeros;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class RowColumnZero {
	public static void main(String[] args) {
		Map<Integer,Integer> hashTable=new HashMap<Integer,Integer>();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row=scanner.nextInt();
		System.out.println("Enter no. of columns");
		int col=scanner.nextInt();
		int[][] array=new int[row][col];
		System.out.println("Enter array");
		for(int i=0;i<row;i++)
		{
			System.out.println("Enter 1st Row");
			for(int j=0;j<col;j++){
				array[i][j]=scanner.nextInt();
				if(array[i][j]==0){
					hashTable.put(i, j);
				}
			}
		}
		Set<Map.Entry<Integer,Integer>> entrySet=hashTable.entrySet();
		for(Entry<Integer,Integer> entry:entrySet){
			for(int i=0;i<col;i++){
				//Integer x=entry.getKey();
				array[entry.getKey().intValue()][i]=0;
			}
			for(int i=0;i<row;i++){
				//Integer x=entry.getKey();
				array[i][entry.getValue().intValue()]=0;
			}
		}
		for(int i=0;i<row;i++)
		{
		//	System.out.println("Enter 1st Row");
			for(int j=0;j<col;j++){
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
	}
}
