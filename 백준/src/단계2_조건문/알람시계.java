package 단계2_조건문;

import java.util.Scanner;

public class 알람시계 {

	public static void main(String[] args) {
		
		//다시 연습하기!
		
		Scanner sc=new Scanner(System.in);
		
		int H=sc.nextInt();//시-24시간
		int M=sc.nextInt();
		
		if(M<45) {
			H--;//H-=1;
			M=(60-(45-M));
			if(H<0) {
				H=23;
			}
			System.out.println(H+" "+M);
		}else {
			System.out.println(H+" "+(M-45));
		}
		
	}

}
