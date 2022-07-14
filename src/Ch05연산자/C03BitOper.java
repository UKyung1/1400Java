package Ch05연산자;

public class C03BitOper {

	public static void main(String[] args) {
	
		
		//비트논리연산자
		//& AND: 두비트 모두 1이면 1
		//| OR: 두비트 중 하나라도 1이면 1
		//^ XOR: 두비트 중 하나라도 1이면 1(단 1 1 일때는 0)
		//~ NOT: 비트 반전
		
		int num1=15; //00000000 00000000 00000000 00001111
		int num2=20; //00000000 00000000 00000000 00010100
		int num3=num1&num2; //&비트 단위로 and연산
		                    //00000000 00000000 00000000 00000000
        int num4=num1|num2; //OR연산
                            //00000000 00000000 00000000 00000000
        int num5=num1^num2; 
                            //00000000 00000000 00000000 00011011
        int num6=~num1; //11111111 11111111 11111111 11110000 
                        //num1의 보수
        
        System.out.println("And 비트 연산 : "+ num3);
        System.out.println("OR 비트 연산 : "+ num4);
        System.out.println("XOR 비트 연산 : "+ num5);
        System.out.println("NOT 비트 연산 : "+ num6);
	}

}
