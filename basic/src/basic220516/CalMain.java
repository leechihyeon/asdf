package basic220516;

public class CalMain{


	public static void main(String[] args) {
		Cal cal=new Cal();	//1.사용하려는 객체 생성
		cal.setResult(cal.plus(100,200));	//2.셋팅
		cal.print();	//3.사용

		Cal cal1=new Cal(100,20,'*');
		cal1.print();
		
		
		
	}

}
