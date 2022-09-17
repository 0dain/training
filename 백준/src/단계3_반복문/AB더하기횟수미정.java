package 단계3_반복문;

import java.util.ArrayList;
import java.util.Scanner;

public class AB더하기횟수미정 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		//두 정수 A와 B를 입력받은 다음 A+B출력
		//단 0<A, B<10
		
		
		//EOF에 대해 알아야함 => hasNextInt() => 입력된 토큰이 있으면 true, 없으면 false
		//입력에서 더이상 읽을 수 있는 데이터가 없으면 반복문 종료
		
//		ArrayList<Integer> arr=new ArrayList<>();
		
		while(sc.hasNextInt()) {
			int head=sc.nextInt();
			int rear=sc.nextInt();
			System.out.println(head+rear);
//			arr.add(head+rear);		
		}
		
//		for(int i=1;i<=arr.size();i++) {
//			System.out.println(arr.get(i));
//		}
		
	}

}
