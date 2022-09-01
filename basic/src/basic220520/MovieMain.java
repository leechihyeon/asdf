package basic220520;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Movie[] movie=new Movie[10];
		String title=null;
		int minute=0;
		String act=null;
		System.out.println("제목을 입력하세요");
		title=scan.next();
		System.out.println("상영시간을 입력하세요");
		minute=scan.nextInt();
		System.out.println("작가을 입력하세요");
		act=scan.next();
		
		movie[0]=new Movie(title,minute,act);
		
		movie[0].print();
		
		movie[0].update("아름다운 라이프",90,"너");
		
		movie[0].print();
	
}

}
