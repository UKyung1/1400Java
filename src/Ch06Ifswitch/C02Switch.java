package Ch06Ifswitch;

import java.util.Scanner;

public class C02Switch {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int rank=sc.nextInt();
		
		switch(rank)//rank값은 상수값만 넣을 수 있음(rank>2 이런건 안됨)
		
		{
		case 1: System.out.println("금메달 입니다"); //rank에 들어간 숫자가 1이라면 금메달
		        break; //아니라면		  
		case 2 : System.out.println("은메달 입니다");
		        break;
		case 3 : System.out.println("동메달 입니다");
		        break; 
		default : System.out.println("!!");
		}

	}

}
