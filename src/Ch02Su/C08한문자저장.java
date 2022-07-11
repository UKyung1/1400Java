package Ch02Su;

public class C08한문자저장 {

	public static void main(String[] args) {
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'가');
		System.out.println((int)'나');
		
		
		//유니코드 문자를 16진수로 출력
		System.out.printf("%X\n",(int)'가');
		System.out.printf("%X\n",(int)'나');
		
		//수를 유니코드 문자로 출력
		System.out.println('\ub090');

		//숫자든 문자든 모두 비트로 저장되어서 서로서로 출력가능

	}

}
