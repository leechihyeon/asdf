package basic220526;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileMain {

	public static void main(String[] args) throws IOException {
		/* ���� ���� */
		/*
		File file=new File("c.txt");
		file.createNewFile();
		//file.delete();
		
		//File dir=new File("dir");
		//dir.mkdir();
		//dir.delete();
		*/
		
		//System.in.read()�Լ��� �޸𸮿� �ִ� ������ �о���±��
		//Ű����κ��� �޸𸮿� �Էµ� ������ ���� �о� ��
		/*	  
		System.out.println(System.in.read());
		System.out.println((char)System.in.read());
		System.out.println(System.in.read());
		*/
		
		/*Ű���� �Է� �� ����Ű�� ���� ������ ���� ���*/
		//��Ʈ���� ��� ���� �� �Է°��ɻ��°� ��
		//Ű���带 ���� ������ ����Ϸ��� �̺�Ʈ ���
		//Ű�����Է�->stream���� ����->ȭ��
		
		/*
		while(true) {
			char ch=(char) System.in.read(); 
			System.out.print(ch);
		}
		*/
		//���ڸ� ��Ƽ� ����ϴ� ���
		char ch = 0;
		System.in.read();
		while(System.in.available()!=0) {
			ch=(char) System.in.read(); 
		}
		System.out.print(ch);
		
		/* in.read()�� �޸𸮷κ��� ���� �о���� �Լ�*/
		/*
		while(true) {
			char ch=(char) System.in.read();
			System.out.println(System.in.available());
			System.out.print(ch);
		}
		*/
		
		/* -------Ű���� ��� ���Ͻ�Ʈ�� ���------*/
		/*
		File file=new File("c.txt");
		if(file.exists()) {
			System.out.println("������ �����մϴ�.");
		}else {
			System.out.println("������ �������� �ʽ��ϴ�.");
			file.createNewFile();
		}
		//�޸𸮿� �������ִ� �۾�
		//read()�Լ��� ������ �����ϹǷ�
		//char������ �޾� ����� ��� ���ϳ��� Ȯ���� �� ����
		//inputstream�� �޸� ������ �ǹ��ϸ�
		//fileinputstream�� ���ϳ����� �޸𸮷� �Է��Ѵٴ� �ǹ�
		
		FileInputStream fis=new FileInputStream(file);
		
		while(true) {
			int c=fis.read();
			if(c==-1) break;
			System.out.print((char)c);
		}
		System.out.println("���α׷�����");
		*/
		
		/* ����(�޸�)->���Ͽ� ����*/
		/*
		File file=new File("a.txt");
		file.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(file);
		//fos.write(97);
		//fos.flush(); //socket�϶� ������ϴ� �Լ�
		
		String data="hello";
		//fos.write(data.getBytes());
		fos.write(data.getBytes(),0,2);
		fos.flush();
		*/
		
	}

}
