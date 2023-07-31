package com.gradedproject.q2;

import java.util.Scanner;

public class  Power {

	static int power(int X,int N) {
		if(N==0) {
			return 1;
			}
		else
			return X*power(X,N-1);
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the base number X:");
		int X=sc.nextInt();
		System.out.print("Enter the power N:");
		int N=sc.nextInt();
		int result=power(X,N);
		System.out.println("X power N is:"+result);
		}


}