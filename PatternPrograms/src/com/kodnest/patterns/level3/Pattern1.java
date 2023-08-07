package com.kodnest.patterns.level3;

public class Pattern1 {
public static void main(String[] args) {
	for(int i=0;i<2;i++) {
		for(int j=i+1;j>0;j--) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
