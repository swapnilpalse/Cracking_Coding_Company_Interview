package com.cracking.coding.company.practise.strings;

import java.util.Scanner;

public class FrequencyChecker {
	public static void main(String[] args) {
		String string;
		int hashtable[]=new int[256];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String");
		string=scanner.nextLine();
		boolean flag=false;
		for(char c:string.toCharArray()){
			if(!flag)
				flag=++hashtable[c]>1?true:false;
			else
				hashtable[c]++;
		}
		StringBuffer sb=new StringBuffer();
		if(!flag){
			System.out.println(string);
		}else{
			boolean flags[]=new boolean[256];
			for(char c:string.toCharArray()){
				if(!flags[c]){
					sb=sb.append(c).append(hashtable[c]);
					flags[c]=true;
				}
			}
			System.out.println(sb.toString());
		}
	}
}
