package Ch01;

public class Ch02BasicOutputMethod {

	public static void main(String[] args) {
        //System.out : 표준 출력 스트림 (해석 : 표준출력장치(모니터)에 데이터 전달)
		
		//System.out.print() : 콘솔화면에 내용 출력
		//Eascape문자 사용을 통한 개행(줄바꿈)
		//Eascape : 탈출하다, 벗어나다.
		//Eascape문자 : 기존의 문자용도를 벗어나 특정한 기능 수행에 사용되는 특수문자
		// \n : 줄바꿈(개행)
		// \b : 한문자 삭제
		// \t : 8칸 커서 이동
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		

		System.out.print("   *\n");
		System.out.print("  ***\n");
		System.out.print(" *****\n");
		System.out.print("********\n");
		System.out.print(" *****\n");
		System.out.print("  ***\n");
		System.out.print("   *\n");
		
		//System.out.printf()
		//format : 형식, 서식
		//서식 : 서류를 꾸미는 일정한 양식
		//%d : 10진 서식문자
		//%f : 실수 서식문자
		//%c : 한문자 서식문자
		//%s : 문자열 서식문자
//		System.out.printf("%d\n",10);
//		System.out.printf("%d + %d = %d\n", 10,20,10+20);
//		System.out.printf("%f + %f = %f\n", 10.23, 20.75, 10.23+20.75);
//		System.out.printf("%c %c %c\n", 'A','B','C');
//		System.out.printf("%s %s %s \n", "This is ", "String","Test");
//		System.out.printf("%d.%s : %d\n", 1,"성적",100);
//		
//		System.out.printf("%s %s %s %s\n", "나의", "이름은", "김유경", "입니다");
//        System.out.printf("%s %s %d %s %s\n", "나의", "나이는", 26, "세", "입니다");
//		System.out.printf("%s %s %c %s\n", "나의", "성별은", '여', "입니다");	
		
		//서식문자 정렬/자리수지정
	    System.out.printf("%-10d%d\n",1234,5678);
	    //%10d : 10칸 확보 후 오른쪽 정렬
	    //-%10d : 10칸 확보 후 왼쪽 정렬
	    
	    System.out.printf("%10.2f\n",10.123456);
	    //10칸 확보 후, 소숫점 2자리까지
	    
	    //주의!= 특수문자 사용시 앞에 \
	    System.out.print("I say \"Hello?\"\n");
	    
	   
		//System.out.println()
	    System.out.println("HELLO WORLD");
	    System.out.println("HELLO WORLD");
	    System.out.println("HELLO WORLD");
	    System.out.println("HELLO WORLD");

	    
	    //서식문자 사용할 것!
	    System.out.printf("%-8s%-8s%-8s%-8s\n", "No", "이름", "나이", "주소");
	    System.out.printf("%02d %s %d %s\n", 1, "홍길동", 20, "대구");
	    System.out.printf("%02d %s %d %s\n", 2, "남길동", 30, "서울");
	    System.out.printf("%02d %s %d %s\n", 3, "서길동", 40, "울산");
	    System.out.printf("%02d %s %d %s\n", 4, "동길동", 50, "김해");
	    
	    
	    
	    System.out.printf("%s  %s  %s  %s\n", "Code", "Title", "Publisher", "Price");
	    System.out.printf("%d  %s  %s  %d\n", 1010, "DoITJAVA", "00미디어", 29000);
	    System.out.printf("%d  %s%c  %s  %d\n", 2020, "윤성우",'C', "오렌지미디어", 25000);
	
	    System.out.println("GitHub Test");
	}

}
