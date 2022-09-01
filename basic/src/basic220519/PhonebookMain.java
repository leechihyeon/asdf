package basic220519;

import java.io.IOException;
import java.util.Scanner;

public class PhonebookMain {

	public static void main(String[] args) throws IOException{
		
		Scanner scan=new Scanner(System.in);
		Phonebook[] pb =new Phonebook[100];//������ ���� 100�� �迭����
		int index=0; //������ ��ġ �ʱⰪ
		int select=0;//�޴���ȣ�� �����ϱ� ���� ����
		String search=null;
		String name=null;
		String tel=null;
		String memo=null;
		
		while(true) {
		menu();
		select=scan.nextInt();
		screenclear();
		switch(select) {
		case 1 : 
			System.out.println("�̸��� �Է��ϼ���.");
			System.out.println("�Է��� ����Ͻ÷��� exit�� �Է��ϼ���.");
			name=scan.next();
			if(name.equals("exit")) {
				break;
			}
			System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
			tel=scan.next();
			if(tel.equals("exit")) {
				break;
			}
			System.out.println("�޸� �Է��ϼ���.");
			memo=scan.next();
			if(memo.equals("exit")) {
				break;
			}
			pb[index]=new Phonebook(name,tel,memo);
			index=index+1;
			break;
		
		case 2 :
			for(int i=0;i<index;i++) {
				if(!pb[i].name.equals(" ")) {
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
					int searchindex = i;
					System.out.println("������ �̸��� �Է��ϼ���.");
					name=scan.next();
					System.out.println("��ȭ��ȣ�� �Է��ϼ���.");
					tel=scan.next();
					System.out.println("�޸� �Է��ϼ���.");
					memo=scan.next();
					pb[searchindex].update(name,tel,memo);
					break;
				}
				if(i==index-1) {
					System.out.println("�˻��� �̸��� �����ϴ�.");
				}
			}
			
			break;
		case 5 :
			System.out.println("������  �̸��� �Է��ϼ���.");
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
		System.out.println("   0. ���α׷� ����    ");
		System.out.println("-----------------------------");
	}
}
