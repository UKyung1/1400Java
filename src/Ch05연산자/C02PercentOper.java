package Ch05연산자;

import java.util.Scanner;

public class C02PercentOper {

	public static void main(String[] args) {
	//% 나머지연산자
		Scanner sc=new Scanner(System.in);
		
		//01 짝홀수 구분
//		System.out.println("확인 : " +(10%2));//왼쪽은 대상 오른쪽은 나누는 수
//		System.out.println("확인 : " +(11%2));//0이 나오면 짝수 1이 나오면 홀수
//		System.out.println("확인 : " +(12%2));
//		System.out.println("확인 : " +(13%2));
//		System.out.println("확인 : " +(14%2));
//		System.out.println("확인 : " +(15%2));
		
//		int num=sc.nextInt();
//		
//		String result=(num%2==00)?"짝수입니다":"홀수입니다";//num이 짝수일때 짝수입니다.
//		System.out.println(result);
		
		
		//02 배수구분
		//수%3==0은 3의 배수
		System.out.println("확인 : " +(10%3));
		System.out.println("확인 : " +(11%3));
		System.out.println("확인 : " +(12%3)); //num%3==00
		System.out.println("확인 : " +(13%3));
		System.out.println("확인 : " +(14%3));
		System.out.println("확인 : " +(15%3));
		
		
		//03 자리수 확인
		System.out.println(123456789);
		System.out.println(123456789%10);//%10을 달면 끝 한자리
		System.out.println(123456789%100);//%100을 달면 끝 두자리
		System.out.println(123456789%1000);
		System.out.println(123456789/100000000);// /10을 자리수에 맞게 입력하면 첫번째 한자리씩 더 붙어서 출력
		System.out.println(123456789/10000000);
		System.out.println(123456789/1000000);
		
		
		//04 범위 제한
		//N%2=>0-1
		//N%3=>0-2
		//N%4=>0-3
		//N%10=>0-9
		//N%100=>0-99
	}

}
