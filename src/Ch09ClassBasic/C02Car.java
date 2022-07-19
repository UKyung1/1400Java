package Ch09ClassBasic;

public class C02Car {
 //속성
	public owner:String
	public speed:int
	public fuel:int
	
 //기능
	public Accel(): void ->owner +"님의 차의 속도를 증가합니다" 가 출력
	public Break(): void ->owner+"님의 차의 속도가 감소합니다" 가 출력
	public ShowInfo(): void->멤버변수의 값을 모두 화면에 출력
}
