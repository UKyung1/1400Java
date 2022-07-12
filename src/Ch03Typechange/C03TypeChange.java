package Ch03Typechange;

public class C03TypeChange {

	public static void main(String[] args) {
		int num1 =129;
		int num2=130;
		byte ch1=(byte)num1; //4바이트 짜리 값을 1바이트 값으로 강제 형변화으로 값이 다르게 나옴
		byte ch2=(byte)num2;
		System.out.println(ch1);
		System.out.println(ch2);
		

	}

}
