package 단계3_반복문;

import java.util.Scanner;

public class 영수증 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//첫째 줄에는 영수증에 적힌 총 금액 X가 주어진다.
		//둘째 줄에는 영수증에 적힌 구매한 물건의 종류의 수 N이 주어진다.
		
		//구매한 물건의 가격과 개수로 계산한 총 금액이 영수증에 적힌 총 금액과 일치하면  Yes, 아니면  No
		
		int total=sc.nextInt();//영수증에 적힌 총 금액
		int kindNum=sc.nextInt();//영수증에 적힌 구매한 물건의 (종류의) 수
		
		int[] mult=new int[kindNum];//각 물건 종류에 따른 금액 저장
		int sum=0;//물건 총합 저장
		
		for(int i=0;i<kindNum;i++) {//내가 산 물건의 금액을 저장할 반복문
			int cash=sc.nextInt();//가격
			int num=sc.nextInt();//개수
			mult[i]=cash*num;
		}
		
		for(int i=0;i<kindNum;i++) {//구매한 물건들의 금액을 다 더해서 총합과 비교할 반복문
			sum+=mult[i];
		}
		
		if(total==sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}

}
