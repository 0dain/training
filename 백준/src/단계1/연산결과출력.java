package 단계1;

import java.util.Scanner;

public class 연산결과출력 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String c=sc.next();
        int year=sc.nextInt();
        
        
        //더하기
        System.out.println(a+b);
        //빼기
        System.out.println(a-b);
        //곱하기
        System.out.println(a*b);
        //나누기
        System.out.println((double)a/b);
        
        //문자출력
        System.out.println(c+"??!");
        
        //연도 출력 - 불기 연도를 서기 연도로 변화한 결과 출력
        //2541를 1998로 바꾸려면?~
        System.out.println(year-543);
        
	}

}
