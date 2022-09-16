package 단계3_반복문;

import java.util.Scanner;

public class 누적합 {

	public static void main(String[] args) {
		
		//n이 주어졌을 때 1부터 n까지의 합을 구하라
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
