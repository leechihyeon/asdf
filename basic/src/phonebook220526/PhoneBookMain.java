package phonebook220526;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookMain {

	public static void main(String[] args) throws IOException {
//	PhoneBook pb=
//		new PhoneBook("홍길동","010-1111-1111","특이사항없음");
//	System.out.println(pb.toString());
		/*
		 * 기본적인 내용을 익히기 위한 학습
		PhoneBook pb[]=new PhoneBook[10];
		for(int i=0;i<10;i++) {
			//파일로 부터 읽어온 한줄의 데이터를 배열에 넣고
			//PhoneBook객체를 생성함
		pb[i]=new PhoneBook("홍길동","010-1111-1111","특이사항없음");
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(i+":"+pb[i].toString());
		}
		*/
		//객체를 만들기 위한 10개의 공간을 확보
		PhoneBook pb[]=new PhoneBook[10];
		//파일데이터를 읽어오는 작업
		//코드와 데이터는 분리하여 관리한다.
		File f1=new File("phonebook.txt");
		FileReader f2=new FileReader(f1);
		BufferedReader f3=new BufferedReader(f2);
		String imsi=null;
		int i=0;
		//파일로 부터 데이터를 읽어오고
		//문자열을 다시 스페이스로 분리하여 배열에 넣고
		//배열의 값을 객체를 생성하는데 사용
		while((imsi=f3.readLine())!=null) {
			String arr[]=imsi.split(" ");
			pb[i]=new PhoneBook(arr[0],arr[1],arr[2]);
			i++;
		}
		
		//입력된 값을 확인
		for(int j=0;j<i;j++) {
			System.out.println(pb[j]);
		}
		
	}

}
