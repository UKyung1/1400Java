package Ch09ClassBasic;
class Tv
{//속성
	String corporation;
	int year;
	int inch;
 //기능
	void showInfo()
	{System.out.printf("회사 : %s 년도 : %d 인치 : %d\n", corporation,year,inch);
		
		
	}
}
public class C05TVMain {

	public static void main(String[] args) {
	Tv myTv=new Tv();
	myTv.corporation="LG";
	myTv.year=2022;
	myTv.inch=32;
	myTv.showInfo(); //함수 호출시 "회사: LG 년도: 2022 인치: 32가 출력되어야합니다"

	}

}
