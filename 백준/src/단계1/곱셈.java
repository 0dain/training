package 단계1;

import java.util.Scanner;

public class 곱셈 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();//472
		int num2=sc.nextInt();//385
		
		int num3=num1*(num2%10);

		int num4=num1*(num2%100/10);
		
		int num5=num1*(num2%1000/100);

		int num6=num1*num2;
		
		
		System.out.println(num3);//2360
		System.out.println(num4);//3776
		System.out.println(num5);//1416
		System.out.println(num6);//181720
		
		sc.close();
		
	}

}
