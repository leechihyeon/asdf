package basic220526;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderMain {

	public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("readfile.txt");
	
	int count;
	char[] buf=new char[100];
	while((count=f.read(buf))!=-1) {
		String data=new String(buf,0,count);
		System.out.println(data);
	}
	f.close();
	}

}
