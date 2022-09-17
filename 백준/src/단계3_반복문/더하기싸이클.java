package 단계3_반복문;

import java.util.Scanner;

public class 더하기싸이클 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//n이 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고 각 자리의 수를 더하기, 그 다음 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있음
		//ex. n=26일 때 => 2+6=8, 새로운 수는 68 => 6+8=14, 새로운 수 84 => 8+4=12, 새로운 수 42 => 4+2=6 => 새로운 수 26
		//26으로 돌아오기 까지의 횟수를 cnt함 cnt=4임
		int n=sc.nextInt();//입력하는 수 0보다 크거나 같고 99보다는 작거나 같은 정수
		
		//6  24
		System.out.println((n%10)*10);//60  40
		System.out.println(n/10);//0  2
		System.out.println(n%10);//6  4
		System.out.println((n/10)+(n%10));//6  6
		System.out.println(((n/10)+(n%10))%10);//6  6
		System.out.println(((n%10)*10)+(((n/10)+(n%10))%10));//66  46
		
//		int n=6;
		int cnt=0;//사이클 도는 횟수
		
		int temp=0;
		int temp2=0;
		int sum=0;
		
//		while(true) {
//			if(n<10) {
//				temp2=n*100;
//				temp=temp2%100;//앞
//				temp2=temp2/100;//뒤
//				System.out.println(temp);//0
//				System.out.println(temp2);//6
//				sum=temp+temp2;
//				cnt++;
//				if(sum==n) {
//					System.out.println(cnt);
//					break;
//				}
//			}else {//1
//				temp=n%10;//뒤 6
////				System.out.println(temp);
//				temp2=n/10;//앞 2
////				System.out.println(n);
//				sum=temp2+temp; // 2+6 = 8
//				cnt++;//1
//				
//				if(sum!=n) {//3 // 8 != 26
//					
//					if(sum<10) {
//						int a=temp+sum;//6+8 = 14
//						cnt++;//1				
//					}else {// 14>10 , 8 4 => 8+4=12
//						int num1=temp;//연산했던 숫자의 뒤 쪽 숫자 
//						int num2=sum%10;//연산 결과의 일의 자리 숫자 4
//						sum=num1+num2;
//						cnt++;
//						if(sum==n) {
//							System.out.println(cnt);
//							break;
//						}
//					}
//					
//				}//3
//				 else {//2
//					System.out.println(cnt);
//					break;
//				}//2
//			}//1
//			
//			
//			
//			
//		} //while문
		
	}

}
