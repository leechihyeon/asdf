package basic220516;

public class CalMain{


	public static void main(String[] args) {
		Cal cal=new Cal();	//1.����Ϸ��� ��ü ����
		cal.setResult(cal.plus(100,200));	//2.����
		cal.print();	//3.���

		Cal cal1=new Cal(100,20,'*');
		cal1.print();
		
		
		
	}

}
