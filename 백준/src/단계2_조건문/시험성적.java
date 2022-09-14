package 단계2_조건문;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {

		//시험 점수를 입력받아 90~100점은 A, 80~89점은 B, 70~79점은  C, 60~69점은 D
		//나머지 점수는  F출력
		
		Scanner sc=new Scanner(System.in);
		
		int test=sc.nextInt();
		
		if(test>=90) {
			System.out.println("A");
		}else if(test>=80) {
			System.out.println("B");
		}else if(test>=70) {
			System.out.println("C");
		}else if(test>=60) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
		
		
	}

}
