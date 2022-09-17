package 단계3_반복문;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 빠른더하기 {

	public static void main(String[] args) throws IOException {
		
		//횟수 n개 만큼 두 정수 A와 B를 입력받은 다음, A+B를 출력
		//근데 이건 빠른 연산이되어야 해서(제한시간 1초) Scanner, System.out.println말고 
		//BufferedReader와 BufferedWriter를 사용해야 함
		
		//Scanner, System.out.println으로 한 거
		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();//횟수
		int[] sum=new int[cnt];//입력 받은 값 더해서 저장할 공간
		
		for(int i=0;i<cnt;i++) {
			int head=sc.nextInt();
			int rear=sc.nextInt();
			sum[i]=head+rear;
		}
		
		for(int i=0;i<cnt;i++) {
			System.out.println(sum[i]);
		}
		
		
		//Buffer로 한 거
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		//버퍼는 문자열로 반환되기 때문에 정수형으로 계산을 하려면 형변환이 필수~!
		
		//try~catch로 오류 잡아주기 아니면 
		//public static void main(String[] args) 여기 뒤에 throws IOException 하기!
		
		//내가 짠 코드 - h1+r1이 한 줄에 하나씩 입력이 안 됨..ㅠㅠ
			String cntBuff=br.readLine();//횟수
			int c1=Integer.parseInt(cntBuff);//더 간단하게 쓰는 법 => int c1=Integer.parseInt(br.readLine());
			
			int[] sumBuff=new int[c1];//더한 값 저장할 공간			
			
			for(int i=0;i<c1;i++) {
				int h1=Integer.parseInt(br.readLine());//형변환 해주는 거임~
				
				int r1=Integer.parseInt(br.readLine());//형변환 해주는 거~
				
				sumBuff[i]=h1+r1;//입력받은 값 배열에 저장
			}
			
			for(int i=0;i<c1;i++) {//배열에 있는 결과값 출력
				bw.write(sumBuff[i]+"\n");//개행을 따로 해줘야 함
			}
			bw.flush();//버퍼에 저장된 값을 출력하려면 꼭 이 명령어를 써주야 함!
			
			
			//구글 도움 -  h1+r1을 한 줄에 하나씩 입력
			//공백 포함하는 int형일 때 StringTokenizer객체 활용해야 함!
			StringTokenizer st;
			for(int i=0;i<c1;i++) {
				st=new StringTokenizer(br.readLine());
				bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
			}
			
			bw.flush();//버퍼에 저장된 값을 출력하려면 꼭 이 명령어를 써주야 함!

	}

}
