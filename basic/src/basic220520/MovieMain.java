package basic220520;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Movie[] movie=new Movie[10];
		String title=null;
		int minute=0;
		String act=null;
		System.out.println("������ �Է��ϼ���");
		title=scan.next();
		System.out.println("�󿵽ð��� �Է��ϼ���");
		minute=scan.nextInt();
		System.out.println("�۰��� �Է��ϼ���");
		act=scan.next();
		
		movie[0]=new Movie(title,minute,act);
		
		movie[0].print();
		
		movie[0].update("�Ƹ��ٿ� ������",90,"��");
		
		movie[0].print();
	
}

}
