package ex.java.String;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		double sum = 0;
		
		for(int i = 1; i < 13; i++) {
			sum += Math.pow(i*2, i);
		}
		System.out.println(sum); 
		
	}

}
