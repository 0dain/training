package 단계3_반복문;

import java.util.Scanner;

public class 별찍기1 {

	public static void main(String[] args) {

		
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, n번째 줄에는 별 n개
		
		Scanner sc=new Scanner(System.in);
		
		int star=sc.nextInt();
		
		for(int i=1;i<=star;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
