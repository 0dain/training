package 단계3_반복문;

import java.util.Scanner;

public class AB여러번출력 {

	public static void main(String[] args) {

		//두 정수 A와 B를 입력받은 다음, A+B를 출력
		//테스트 케이스의 개수 T가 주어진다
		
		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();
		
		int front=0;
		int back=0;
		int[] sum=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			front=sc.nextInt();
			back=sc.nextInt();
			sum[i]=front+back;
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println(sum[i]);			
		}
		
	}

}
