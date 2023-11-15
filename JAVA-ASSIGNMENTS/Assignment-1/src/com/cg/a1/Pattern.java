package com.cg.a1;
public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr=5;
			for(int i=0;i<arr;i++) {
				for(int j=arr-i;j>1;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<=i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
	 
		}
	 
	}

