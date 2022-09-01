package phonebook220526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotalPhonebookMain {

	public static void main(String[] args) throws IOException{
		
		Scanner scan=new Scanner(System.in);
		PhoneBook[] pb =new PhoneBook[100];//������ ���� 100�� �迭����
		int index=0; //������ ��ġ �ʱⰪ
		int select=0;//�޴���ȣ�� �����ϱ� ���� ����
		String search=null;
		String name=null;
		String tel=null;
		String memo=null;
		//���Ϸ� ���� �����͸� �о�� ��ü�� �޸𸮿� �ε�
		/* *******file upload********* */
		File f1=new File("phonebook.txt");
		FileReader f2=new FileReader(f1);
		BufferedReader f3=new BufferedReader(f2);
		String imsi=null;
		//���Ϸ� ���� �����͸� �о����
		//���ڿ��� �ٽ� �����̽��� �и��Ͽ� �迭�� �ְ�
		//�迭�� ���� ��ü�� �����ϴµ� ���
		while((imsi=f3.readLine())!=null) {
			String arr[]=imsi.split(" ");
			pb[index]=new PhoneBook(arr[0],arr[1],arr[2]);
			index++;
		}
		f3.close();
		f2.close();
		
		/* **** file upload end ******/
		
		while(true) {
		menu();
		select=scan.nextInt();
		//screenclear();
		switch(select) {
		case 1 : 
			System.out.println("�̸��� �Է��ϼ���.");
			name=scan.next();
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			tel=scan.next();
			
			System.out.println("�޸� �Է��ϼ���.");
			memo=scan.next();
			
			pb[index]=new PhoneBook(name,tel,memo);
			index=index+1;
			break;
			
		case 2 :
			for(int i=0;i<index;i++) {
				if(pb[i]!=null) {
					pb[i].view();
				}
			}
			System.in.read();
			break;
		case 3 :  
			System.out.println("�˻��� �̸��� �Է��ϼ���.");
			search=scan.next();
			for(int i=0;i<index;i++) {
				if(search.equals(pb[i].name)) {
					//System.out.println(pb[i].toString());
					pb[i].view();
					break;
				}
				if(i==index-1) {
					System.out.println("�˻��� �̸��� �����ϴ�.");
				}
			}
			System.in.read();
			break;
		case 4 :  
			//������ ���� ������ ã��(�̸��� �˻��Ͽ� index�� ã�´�)
			//������ �����͸� �Է¹ް�
			//������ �����͸� ��ü�� �ٽ� ����
			System.out.println("������ �������� �˻� �̸��� �Է��ϼ���.");
			search=scan.next();
			for(int i=0;i<index;i++) {
				if(search.equals(pb[i].name)) {
					System.out.println("������ �̸��� �Է��ϼ���.");
					name=scan.next();
					System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
					tel=scan.next();
					System.out.println("�޸� �Է��ϼ���.");
					memo=scan.next();
					pb[i].update(name,tel,memo);
					break;
				}
				if(i==index-1) {
					System.out.println("�˻��� �̸��� �����ϴ�.");
				}
			}
			
			break;
		case 5:
			System.out.println("������ �̸��� �Է��ϼ���.");
			search=scan.next();
			for(int i=0;i<index;i++) {
			if(search.equals(pb[i].name)) {
				pb[i].remove();
				break;
			}
			if(i==index-1) {
				System.out.println("������ �̸��� ã�� �� �����ϴ�.");
			}
			}
			
			break;
		
		case 6: //������ �ҷ�����
			System.out.println("�ҷ��� ���ϸ��� �Է��ϼ���;");
			String filename=scan.next();
			f1=new File(filename);
			if(!f1.exists()) {
				System.out.println("������ �������� �ʽ��ϴ�.");
				break;
			}
			
			
			f2=new FileReader(f1);
			f3=new BufferedReader(f2);
			imsi=null;
			index=0;
			//pb[100]���� ��ü�迭�� null������ �ʱ�ȭ
			for(int k=0;k<pb.length;k++) {
				pb[k]=null;
			}
			
			while((imsi=f3.readLine())!=null) {
				String arr[]=imsi.split(" ");
				pb[index]=new PhoneBook(arr[0],arr[1],arr[2]);
				index++;
			}
			f3.close();
			f2.close();
			break;
		
		case 7: //������ �����ϱ�
			FileWriter f4=new FileWriter(f1);
			BufferedWriter f5=new BufferedWriter(f4);
			
			//�޸�->���Ͽ� ���� �۾��� ����
			
			String str="";
			for(int j=0;j<index;j++) {
				if(!pb[j].name.equals("")) {
					if(j==index-1) {
						str=pb[j].name+" "+pb[j].tel+" "+pb[j].memo;
					}else {
				str=pb[j].name+" "+pb[j].tel+" "+pb[j].memo+"\n";
					}
				f5.write(str);
				f5.flush();
				}
			}
			f5.close();
			f4.close();
			break;
			
		case 0 : 
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0); break;
		}
		}//end while
	}
	
	static void screenclear() {
		for(int i=0;i<80;i++) {
			System.out.println("");
		}
	}

	static void menu() {
		System.out.println("-----------------------------");
		System.out.println("      ��ȭ��ȣ�� �޴�       ");
		System.out.println("-----------------------------");
		System.out.println("   1. ��ȭ��ȣ�� �Է�    ");
		System.out.println("   2. ��ȭ��ȣ�� ��ü ���    ");
		System.out.println("   3. ��ȭ��ȣ�� �˻�    ");
		System.out.println("   4. ��ȭ��ȣ�� ����    ");
		System.out.println("   5. ��ȭ��ȣ�� ����    ");
		System.out.println("   6. ������ �ҷ�����    ");
		System.out.println("   7. ������ ����    ");
		System.out.println("   0. ���α׷� ����    ");
		System.out.println("-----------------------------");
	}
}
