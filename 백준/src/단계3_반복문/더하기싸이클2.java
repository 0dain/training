package 단계3_반복문;

import java.util.Scanner;

public class 더하기싸이클2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//n이 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고 각 자리의 수를 더하기, 그 다음 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있음
		//ex. n=26일 때 => 2+6=8, 새로운 수는 68 => 6+8=14, 새로운 수 84 => 8+4=12, 새로운 수 42 => 4+2=6 => 새로운 수 26
		//26으로 돌아오기 까지의 횟수를 cnt함 cnt=4임
		int n=sc.nextInt();//입력하는 수 0보다 크거나 같고 99보다는 작거나 같은 정수
		
		int cnt=0;//사이클 도는 횟수
		
		int temp=n;

		
		while(true) {
			
			n=((n%10)*10)+(((n/10)+(n%10))%10); //66
			cnt++;
			
			if(temp==n) {
				System.out.println(cnt);
				break;
			}
			
		} //while문
		
	}

}
