package 단계3_반복문;

import java.util.Scanner;

public class AB더하기출력문구업글 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();//횟수
		int[] sum=new int[cnt];//입력 받은 값 더해서 저장할 공간
		int[] head=new int[cnt];
		int[] rear=new int[cnt];
		
		for(int i=0;i<cnt;i++) {
			head[i]=sc.nextInt();
			rear[i]=sc.nextInt();
			sum[i]=head[i]+rear[i];
		}
		
		//Case #1: head+rear=sum[i]로 출력되게 하기
		for(int i=0;i<cnt;i++) {
			System.out.println("Case #"+(i+1)+": "+head[i]+" + "+rear[i]+" = "+sum[i]);
		}		
		
	
	}

}
