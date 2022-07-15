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
		
		int i=0; //줄바꿈
		int j=0; //별
		while (i<4)
			
			
		{
			j=0; //줄바꿈 안에 별을 찍는거기 때문에 i문 안에 j의 while문을 씀
			while(j<5)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();//j while문이 거짓이 되는 순간 이게 출력
			
		    i++;//j증가
		}
		
        		
		//*
		//**
		//***
		//****
		
		//****
		//***
		//**
		//*
		
		//    *
		//   ***
		//  *****
		// *******
		
		
		
		
		
		
}
}


      
         