package Ch07While;

import java.util.Scanner;

public class C03breakContinue {

	public static void main(String[] args) {
	//-1을 입력하기 전까지는 무한대로 값을 입력받아
    //입력된 값의 합을 출력
		
//		Scanner sc=new Scanner(System.in);
//		
//		int sum=0; //누적합
//		int data=0; //값받기
//		while(true)
//		{data=sc.nextInt();
//		if(data==-1)
//			break;//가장 근접한 while문을 벗어남
//		sum +=data;
//		}
//       System.out.println("누적 합 : " +sum);	
	
		
		
		//continue
	    //1부터 10까지의 수 중에 3의 배수는 제외한 합을 출력
		
//		int i=1;
//		int sum=0;
//		while(i<=10)
//		{
//			if(i%3==0)
//			{
//			i++;	//i++가 없으면 3에서 무한 반복함
//			continue; //가까이에 있는 반복문의 조건식으로 돌아감
//			}
//			
//			System.out.println("i : "+i);
//		    sum+=i; //누적
//			i++;
//		}
//		System.out.println("sum : "+sum);
		
		
		//문제
		//1부터 N(입력받은 값)까지의 수 중에
		//4의 배수는 제외한 수의 합과 평균을 출력
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		int sum=0;
		int agv=0;
		int cnt=0; //누적 카운트********
		while(i<=n)
		{if (i%4==0)	
			{i++;
			continue;}
		System.out.println("i : "+i);
		sum=sum+i; //sum+=i;
		i++;
		cnt++;
		}
		agv=sum/cnt;
		System.out.println("누적합 : "+sum);
		System.out.println("평균 : "+((double)sum/cnt)); //그냥 agv하면 안됨
		
	}

}
