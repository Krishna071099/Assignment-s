package com.cg.a3;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		System.out.println("Fibonacci serie up to " +n+ " terms:");
		int firstTerm=0,secondTerm=1;
		for(int i=0;i<n;i++) {
			System.out.println(firstTerm+" ");
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
		}
	}
}
 