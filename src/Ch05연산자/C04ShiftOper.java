package Ch05연산자;

public class C04ShiftOper {

	public static void main(String[] args) {
	
    int num1=15;
    int num2=20;
    int num3=num1<<2; //비트를 왼쪽으로 두칸 밀기
                         //00000000 00000000 000000000 00001111
                         //  000000 00000000 000000000 0000111100
    int num4=num1>>2;

    System.out.println("num3 : " +num3);
    System.out.println("num4 : " +num4);
	}

}
