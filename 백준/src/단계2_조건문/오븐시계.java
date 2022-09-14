package 단계2_조건문;

import java.util.Scanner;

public class 오븐시계 {

	public static void main(String[] args) {

		//오븐 구이가 끝나는 시간을 분단위로 자동 계산
		//오븐 구이를 시작하는 시각과 오븐 구이를 하는데 필요한 시간이 분단위로 주어졌을 때 오븐 구이가 끝나는 시각을 계산 
		//단, 시는 0부터 23의 정수, 분은 0부터 59까지의 정수, 23시 59분에서 1분이 지나면 0시 0분이 됨
		Scanner sc=new Scanner(System.in);
		
		//현재 시각
		int h=sc.nextInt();
		int m=sc.nextInt();
		//소요 시간
		int t=sc.nextInt();
		
		//모든 시간을 분단위로 바꾸기
		int num=h*60+m+t;
		h=num/60;
		m=num%60;
//		System.out.println(num);
//		System.out.println(h+" "+m);
		if(h>24) {
			h=h-24;
		}
		System.out.println(h+" "+m);
		
		
		//분단위로 안 바꿔서 틀린건가!?!?~?!?@?!
//		if(t+m>60) {
//			h+=1;
//			m=(t-60)+m;
//			if(m>=60) {
//				h+=1;
//				m=0;
//			}
//			if(h==24) {
//				h=0;
//			}
//			System.out.println(h+" "+m);
//		}else{//t+m<60
//			System.out.println(h+" "+(t+m));
//		}
		
	}

}
