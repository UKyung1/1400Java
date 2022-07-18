package Ch07While;

public class C02WhileWhile {

	public static void main(String[] args) 
	{
		//전체 구구단 출력(2-9단)
//		int dan=2;
//		int i;
//		while (dan<=9)
//		{
//			i=1;//i는 1로 초기와 
//			while(i<=9)//i는 9까지
//			{System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			 i++;
//			}
//			System.out.println();//거짓일 때 나오는 출력, 거짓
//			dan++;
//		}

		
		
		
		
		
		
		//문제
//		int dan=2;
//		int i;
//		while(dan<=9)
//		{
//			i=9;
//			while(i>0)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//		    System.out.println();
//		    dan++;
//		
//		
//		}

	    //문제
		//9x9 =81
		//9x8 =72
		//...
		//2x1 =2
		
//		int dan=9;
//		int i;
//		while(dan>1)
//		{
//			i=9;
//			while(i>0)
//			{
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//		    System.out.println();
//		    dan--;
//	
//	}

	  	//별찍기
		//*****
		//*****
		//*****
		//*****
		
//		int i=0; //줄바꿈
//		int j=0; //별
//		while (i<4)
//			
//			
//		{
//			j=0; //줄바꿈 안에 별을 찍는거기 때문에 i문 안에 j의 while문을 씀
//			while(j<5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();//j while문이 거짓이 되는 순간 이게 출력
//			
//		    i++;//j증가
//		}
		
        		
		//*
		//**
		//***
		//****
		
//		int i=0;
//		int j=0;
//		while(i<4)
//		{
//		j=0;
//		 while(j<=i)
//			 {System.out.print("*");
//			 j++}
//		     
//		
//		 System.out.println();
//	     i++
//		
//		}
		
		//****
		//***
		//**
		//*
		
//		i         j
//		0         0-3
//		1         0-2 
//		2         0-1 
//		3         0-0
		
	
//		int i=0;
//		int j=0;
//		while(i<4)
//		{j=0;
//		while(j<=3-i)
//		{System.out.print("*");
//		j++;}
//		
//		System.out.println();
//		i++;
//		}
			
			
			
		
		
		//   *
		//  ***
		// *****
		//*******

//		i(행)  j(공백)  k(별)
//		0     0-2     0-0
//		1     0-1     0-2
//		2     0-0     0-4 
//		3             0-6
//		
//		     j=0      k=0
//		     j++      k++
//		     j<=?     k<=2*i
//		  
		
		
//		int i=0;
//		int j=0;
//		int k=0;
//		while(i<4)
//		{j=0; //공백찍기
//		while(j<=2-i)
//		{System.out.print(" ");
//		j++;
//		}
//		k=0; //별찍기
//		while(k<=2*i)
//		{System.out.print("*");
//		k++;
//		}
//		System.out.println(); //행
//		i++;
//		}
		
		//*******
		// *****
		//  ***
		//   *
		
//		j(공백)  k(별)
//		        0-6
//		0-0     0-4
//		0-1     0-2
//		0-2     0-0
		
		int i=0;
		int j=0;
	    int k=6;
		while(i<4)
		{j=0;
		while(j<=i-1)
		{System.out.print(" ");
		j++;		
		}
		k=6;
		while(k<=3*2-i)
		{System.out.print("*");
		k--;
		}
		System.out.println();
		i++;
		
		}
		
		
	   //문제
		//다이아몬드모양출력
		//모래시계모양 출력
		//높이 입력받아 출력하는 직각 사각형
		//높이 입력받아 출력하는 직각 역삼각형
		//높이 입력받아 출력하는 정삼각형
	    //높이 입력받아 출력하는 역삼각형
		//높이 입력받아 출력하는 다이아몬드
		//높이 입력받아 출력하는 모래시계
		
		//다이아몬드
		
		//   *
		//  ***
		// *****
		//*******
	    // *****
	    //  ***
		//   *
		
	    int i=0;
	    int j=2;
	    int k=0;
	    while(i<7)
	    {i=0;
	    
}
}


      
         