package basic220526;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderMain {

	public static void main(String[] args) throws IOException {
//문자배열을 문자열로 바로 처리하기 위한 기술
		/*
		File f1=new File("readfile.txt");
		FileReader f2=new FileReader(f1);
		BufferedReader f3=new BufferedReader(f2);
		System.out.println(f3.readLine());
	}


}
*/
		BufferedReader f3=new BufferedReader(new FileReader(new File("readfile.txt")));
		String imsi=null;
		while((imsi=f3.readLine())!=null) {
			System.out.println(imsi);
		}
	}
}