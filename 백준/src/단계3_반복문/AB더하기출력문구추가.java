package 단계3_반복문;

import java.util.Scanner;

public class AB더하기출력문구추가 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();//횟수
		int[] sum=new int[cnt];//입력 받은 값 더해서 저장할 공간
		
		for(int i=0;i<cnt;i++) {
			int head=sc.nextInt();
			int rear=sc.nextInt();
			sum[i]=head+rear;
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println("Case #"+(i+1)+": "+sum[i]);
		}		
		
	}

}
