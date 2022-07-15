package Ch07While;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
	
	//기본
		//1 탈출용 변수 지정
		//2 탈출용 조건식
		//3 조건식이 false가 되도록하는 연산식
		
		
//		while(true)//조건식이 참인 경우에 {}안에 있는 것을 반복해서 출력
//		{		System.out.println("Hello World!");   }
		
//		int i=1; //1 탈출용 변수
//		while(i<=10); //2 탈출용 조건식
//		{System.out.println("Hello world!"));
//		i++;} //3 조건식이 거짓이 되기 위한 연산식
		
		//02 1부터 10까지 합 구하기
		
//		int i=1;
//		int sum=0; //누적합 저장용
//		while(i<=10)
//		{System.out.println("i="+i);
//		sum=sum+i; //증가되는 i값을 기존의 sum과 합하여 누적
//		 i++;
//		}
//        System.out.println("while벗어남 i="+i);
//        System.out.println("1부터 10까지의 합 : "+sum);
		
        
        
        //문제
        //정수값 하나(N)를 입력받아 1부터 N까지의 합
        
//      Scanner sc=new Scanner(System.in);
//		int N=sc.nextInt();
//		
//		int i=1;
//		int sum=0;
//		while(i<=N)
//		{System.out.println("i="+i);
//		sum=sum+i;
//		i++;}
//		System.out.printf("1부터 %d까지의 합: %d\n", N,sum);
		
		//문제
		//정수값 두개(N,M)을 입력받아 N부터 M까지의 합을 구합니다
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int m=sc.nextInt();
//		
//		//swap (혹시나 n이 m보다 더 클경우 tmp에 값을 넣어서 돌려야됨)
//		if (n>m)
//		{ int tmp=n;
//		  n=m;
//		  m=tmp;
//		}
//		
//		
//		int i=n;
//		int sum=0;
//		while(i<=m)
//		{System.out.println("i= "+i);
//	    sum=sum+i;
//	    i++;
//		}
//		System.out.println("총합 : "+ i);
		
		//2단 구구단
//		int i=1;
//		while(i<=9)
//		{System.out.printf("%d x %d = %d\n",2,i,2*i);
//		 i++;
//		}
		
		//2단 역순
		//2x9=18
		//2x8=16
		//...
		//2x1=2
		
//		int i=9;
//		while(i>0)
//		{System.out.printf("%d x %d = %d\n",2,i,2*i);
//		i--;
//		}
		
		
		
		
		//N단 역순
		//정수값 하나 받아서
		//Nx9=?
		//Nx8=?
		//Nx1=?
		
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		
//		int i=9;
//		while(i>0)
//		{System.out.printf("%d x %d = %d\n",n,i,n*i);
//		i--;
//		}

		//1부터 N까지 수중에????????????????????
		//3의 배수의 합만 구하세요
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int i=1;
		int sum=0;
		while (i<=n)
	{
		if (sum%3==0)
			sum=sum+i;
			i++;
		
		System.out.printf("3의 배수 합 : %d\n", sum);
				
		
		}



		
	}

}
