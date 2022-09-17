package 단계3_반복문;

import java.util.Scanner;

public class 별찍기2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, n번째 줄에는 별 n개
		//단, 오른쪽을 기준으로 정렬한 별 출력
		
		int star=sc.nextInt();
		
		for(int i=1;i<=star;i++) {
			for(int j=star;j>i;j--) {
				System.out.print(" ");
			}
			for(int h=1;h<=i;h++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}

}
