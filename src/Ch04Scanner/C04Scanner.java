package Ch04Scanner;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num=sc.nextInt();
		System.out.println("확인 : "+num);
		
		System.out.print("문자열 : ");
		sc.nextLine(); //이게 없으면 엔터키를 문자로 인식하기 때문에
		               //값이 들어왔다고 인식 후 바로 확인이 옆에 뜸
		String str = sc.nextLine();
		System.out.println("확인 : "+str);

		//nextLine을 사용할 때 주의할 점
		//nextLine만 사용하는 게 아니라
		//nextLine(),nextDouble(),next()함수와 혼용해서 사용하는 경우
		//중간에 nextLine()한번 더 실행해서 버퍼공간에
		//남은 개행을 인식하지 못하도록 한다

	
	
	}

}
