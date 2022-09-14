package 단계2_조건문;

import java.util.Scanner;

public class 윤년 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//연도가 주어졌을 때 윤년이면 1, 아니면 0출력
		//윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때임
		//2012년은 4의 배수이면서 100의 배수가 아니라서 윤년, 1900년은 100의 배수이고 400의 배수가 아니기 때문에 윤년이 아님
		//하지만 2000년은 400의 배수이기 때문에 윤년
		
		int year=sc.nextInt();
		
		if((year%4==0&&year%100!=0)||(year%4==0&&year%400==0)) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}

	}

}
