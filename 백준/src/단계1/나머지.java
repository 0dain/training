package 단계1;

import java.util.Scanner;

public class 나머지 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        
        int a, b, c; 
        a=sc.nextInt();//5
        b=sc.nextInt();//8
        c=sc.nextInt();//4
        
        System.out.println((a+b)%c);//1
        System.out.println(((a%c)+(b%c))%c);//1
        System.out.println((a*b)%c);//0
        System.out.println(((a%c)*(b%c))%c);//0
		
	}

}
