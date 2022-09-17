package 단계3_반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class AB더하기0입력전까지 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//두 정수 A와 B를 입력받은 다음 A+B출력
		//단 마지막 입력에 0 두 개가 들어오면 입력 중단 후 합계 출력
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		while(true) {
			int head=sc.nextInt();
			int rear=sc.nextInt();
			arr.add(head+rear);
			if((head+rear)==0) {
				break;
			}	
		}
		
		for(int i=0;i<arr.size();i++) {
			if(arr.get(i)>0) {
				System.out.println(arr.get(i));					
			}
		}
		
	}

}
