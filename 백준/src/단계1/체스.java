package 단계1;

import java.util.Scanner;

public class 체스 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//검정색 피스는 모두 있으나 흰색 피스 개수가 올바르지 않음
		//체스는 총 16개의 피스를 사용 킹 1, 퀸 1, 룩 2, 비숍 2, 나이트 2, 폰 8로 구성되어있음
		//흰색 피스의 개수가 주어졌을 때 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하라
		
//		int king=sc.nextInt();
//		int queen=sc.nextInt();
//		int rook=sc.nextInt();
//		int bishop=sc.nextInt();
//		int knight=sc.nextInt();
//		int pawn=sc.nextInt();
		
		int[] chess= {1,1,2,2,2,8};//체스 원래 말 개수
		int[] input=new int[6];//청소하면서 발견한 체스 말 입력할 배열
		
		for(int i=0;i<input.length;i++) {
			input[i]=sc.nextInt();
		}
		
		for(int i=0;i<input.length;i++) {
			input[i]=chess[i]-input[i];
			System.out.print(input[i]+" ");
		}		
		
	}

}
