package basic220526;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExamMain {

	public static void main(String[] args) throws IOException {
		//����)�ܼ�â�� a-h���� ���ڸ� �Է��ϸ�
		//���Ͽ� �ܼ�â ���ڰ� �ԷµǴ� ���α׷��� ���弼��.
		//1-1.�ַܼκ��� ���ڿ��� �Է¹޾� ������ ����
		
		byte[] bs=new byte[100];
		System.in.read(bs);
		String data=new String(bs);
		System.out.println(data);
		
		//1-2.�����ϳ��� ������ �޾� ���ڿ��� �����ϴ� ���
		/*
		  String data="";
		 
		int d=System.in.read();
		//d!=13�� �ȵǸ� 10���� ����
		while(d!=13) {
			data=data+(char)d;
			d=System.in.read();
		}
		System.out.println(data);
		*/
		
		//2. ������ ����(File file=new File("data.txt"),create���)
		File file=new File("data.txt");
		//file.createNewFile();
		//3.�ֿܼ��� ����� �������� FileOutputStream�� �̿���
		//���Ͽ� ����
		FileOutputStream fos=new FileOutputStream(file);
		//���ϵڿ� �ٿ����� ��  ��� ��Ʈ���� true�ɼ��� ��
		//FileOutputStream fos=new FileOutputStream(file,true);
		//fos.write(data.getBytes());
		
		//System.out.println(data.length());//����4�ڸ� �Է����� ���
		//4�� ����� ���;������� 100�̶�� ����� ����
		//�̴� ����Ʈũ�⸸ŭ ��ȯ�Ǿ� ���ڿ��� ä����
		int i=0;
		while(bs[i++]!=13) { 	} //�����ǵ���� ���ڿ� ���� Ȯ��
		System.out.println(i-1); //�ݺ����� ������ ������ 1�� �����ϹǷ� -1
		fos.write(data.getBytes(),0,i-1);//��ü������ �� ���ڱ��̸�ŭ ���Ͽ� ��
		fos.flush();
		fos.close();
	}

}
