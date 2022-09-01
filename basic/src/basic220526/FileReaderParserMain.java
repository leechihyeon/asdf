package basic220526;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderParserMain {

	public static void main(String[] args) throws IOException {
		File f1=new File("phonebook.txt");
		FileReader f2=new FileReader(f1);
		BufferedReader f3=new BufferedReader(f2);
		String imsi=null;
		while((imsi=f3.readLine())!=null) {
		System.out.println(imsi);
		String arr[]=imsi.split(" ");
		System.out.println("name:"+arr[0]+",");
		System.out.println("tel:"+arr[1]+",");
		System.out.println("memo:"+arr[2]);
         
	}

}
}