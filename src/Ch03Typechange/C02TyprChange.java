package Ch03Typechange;

public class C02TyprChange {

	public static void main(String[] args) {
		//강제 형변환
		int intval='가';
		char charval=(char)intval; //왼쪽 것으로 강제 형변환
		System.out.println(charval);
		
		long longval=1000;
		intval=(int)longval;
		System.out.println(intval);
		
		double doubleval=3.14;
		intval=(int)doubleval; //강제 형변환(데이터 손실)
		System.out.println(intval);
		

	}

}
