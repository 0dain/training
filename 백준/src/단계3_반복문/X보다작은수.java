package 단계3_반복문;

import java.util.Scanner;

public class X보다작은수 {

	public static void main(String[] args) {

		//정수 n개로 이루어진 수열 A와 정수 X가 주어진다 이때 A에서 X보다 작은 수를 모두 출력
		
		//x보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력, x보다 작은 수는 적어도 하나 존재
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();//비교할 숫자의 개수
		int x=sc.nextInt();//비교할 숫자
		
		int[] num=new int[n];
		int min=0;//작은 값 저장할 공간
		
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
			if(num[i]<x) {
				min=num[i];
				System.out.print(min+" ");
			}
		}
		
	}

}
