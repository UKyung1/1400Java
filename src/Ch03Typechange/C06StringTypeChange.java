package Ch03Typechange;

public class C06StringTypeChange {

	public static void main(String[] args) {
	//1 문자열+나머지 자료형
		//->문자열로 자동형변환->단순연결 처리
		System.out.println("문자열1"+"문자열2");
		System.out.println("문자열1"+','+"문자열2");
		System.out.println("문자열1"+2);
		System.out.println(10.5+"문자열1");
		System.out.println(10+20+"문자열1");//숫자들은 덧셈처리
		
		
	//2 문자열(숫자)->int형으로 변환
		System.out.println("10"+"20");//문자열 단순히 연결
		int num1=Integer.parseInt("10");//문자열 안에 있는 숫자를 int형 숫자로 출력
		int num2=Integer.parseInt("20");
		System.out.println(num1+num2);
		
	    double num3=Double.parseDouble("10.5");
	    double num4=Double.parseDouble("20.5");
	    System.out.println(num3+num4);
		
	//3 숫자형->문자형으로 변환
	    int n1=10;
	    double n2=10.2;
	    System.out.println(n1+n2);//int가 double로 자동형변환되서 연산
	    
	    String str1=String.valueOf(n1); //n1의 값을 문자열로 출력
	    String str2=String.valueOf(n2);
	    System.out.println(str1+str2);
	    
	   
	    
	}

}
