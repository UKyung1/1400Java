package Ch09ClassBasic;
class claculator
뭐라는지 하나도 모르겠다;;



public class C07MethodTest {

	public static void main(String[] args) {
    calculator cal = new calculator();
    
    int r1=cal.sum(10,20);
    System.out.println("r1 : " +r1);
    int r2=cal.sub(50,30);
    System.out.println("r2 : " +r2);
    cal.mul(5,6);//곱셈->곱셈 결과가 함수 내의 print호출로 출력
    cal.div(10,2);//나눗셈->나눗셈 결과가 함수 내의 print호출로 출력

	}

}
