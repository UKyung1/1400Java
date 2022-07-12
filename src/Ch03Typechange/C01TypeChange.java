package Ch03Typechange;

public class C01TypeChange {

	public static void main(String[] args) {
	//형변환
		//데이터 연산(처리)시 자료형이 다른 값들을 일치시키는 작업
		
	//형변환 종류
		//자료형(암시적) 변환 : 컴파일러에 의해 자동으로 자료형이 일치, 데이터 손실염려X
		//ex) int형을 long형으로 자동적 변환, 큰 공간에 작은 공간의 값을 대입
		//강제형(명시적) 변환 : 프로그래머에 의해 강제적으로 자료형을 일치, 데이터 손실염려O
		//ex) int형을 byte형으로 변환할 때 , 작은 공감에 큰 공간의 값을 대입
		
	    //1 자동형변환
		//byte<short,char<int<long<float<double
		byte byteval=10;
		int intval=byteval; //자동형 변환, byte를 꺼내와서 int로 형변환,작->큰
		System.out.println("intval : " + intval);
		
		char charval = '가';
		intval = charval;
		System.out.println("intval : " + intval);
		
		long longval = intval;
		System.out.println("lonval : " + longval);
		
		float floatval=longval; //자동형변환,정수값->실수로 표현 가능
		System.out.println("floatval : " + floatval);
		
		double doubleval=floatval;
		System.out.println("doubleval : " + doubleval);

	}

}
