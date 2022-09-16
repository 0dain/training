package 단계3_반복문;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
		
		//n을 입력 받은 뒤, 구구단 n단을 출력하는 프로그램 작성
		//n은 1보다 크거나 같고, 9보다 작거나 같음
		//n*1~n*9까지 출력
		
		 Scanner sc=new Scanner(System.in);
		 
		 int dan=sc.nextInt();
		 
		 for(int i=1;i<=9;i++) {
			 System.out.printf("%d * %d = %d \n", dan, i, dan*i);
		 }
		
		
	}
	
}
