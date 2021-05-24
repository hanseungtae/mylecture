package ex.java.String;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// 1에서 n까지 소수 출력
		// 1보다 큰 자연수 중 1과 자기 자신만을 약수로 가지는 수다.
		// 예) 5는 1*5 또는 5*1로 수를 곱한 결과를 적는 유일한 방법이 그 수 자신을 포함하기 때문에 5는 소수이다.
		// 그러나 6은 자신보다 작은 두 숫자(2*3)의 곱이므로 소수가 아니다
		// 1과 그 수 자신 이외의 자연수로는 나눌 수 없는 자연수로 정의하기도 한다.
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int i = 2; // i : 나눌대상
		
		boolean isPrime = true;
		
		while ( i <= num) {
			
			isPrime = true;
			
			for(int n = 2; n <i; n++) {
				
				if(i%n==0) {
					isPrime = false;
				}
				continue;
			}
			
			if(isPrime == true) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("");
	}

}
