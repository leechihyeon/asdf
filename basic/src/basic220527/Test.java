package basic220527;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//����1.
//int a=10; 
/*����2
int b=11;
int c=12;
int d=13;
int e=14;
*/
//����3
//int[] aa_array = {10,11,12,13,14};
//����4
//������ ���� ���ӵ� �޸� ������ �����ϱ� ������ �����ϱⰡ ���ϴ�.
//����5
//String s="Hello";
//����6
String ss[]= {"hello111","hello2111","hello3111","hello4","hello5"};
System.out.println();


/*	for(int i=0;i<ss.length;i++) {
		ss[i]
	}
//����7
class Memo{
	int num;
char content;*/
		//forEach��� (�Ϲ� ��ü �迭������ ����� �� ������
		//�÷��ǰ�ü���� ����� ������ ���� 
	List<String> list=new ArrayList<>();
	list.add("hello1");
	list.add("hello2");
	list.add("hello3");
	list.add("hello4");
	list.add("hello5");
	
	System.out.println("forEach���ٽ�");
	list.forEach(imsi1->System.out.println(imsi1));
	list.forEach(System.out::println);
	
	Memo m2=new Memo();
	System.out.println(m2.toString());
	
	Memo m1=new Memo(1,"java study");
	System.out.println(m1.toString());
	
	//Ŭ������ �迭�� new��ü�� �����ϴ� ���� ��ü������ �ϴ� ���̾ƴϰ�
	//�迭������ Ȯ���ϱ� ���� �۾��̴�.
	Memo m[]=new Memo[5];
	m[0]=new Memo(1,"java");
	m[1]=new Memo(2,"html");
	m[2]=new Memo(3,"javascript");
	//�ε��� ���� 0,3�� �Է��Ͽ� �׽�Ʈ �ϼ���.
	if(m[3]!=null) {
		System.out.println("�޸� ��ü�� �����Ǿ� �ֽ��ϴ�.");
	}else {
		System.out.println("�޸� ��ü�� �����Ǿ� ���� �ʽ��ϴ�.");
	}
	
	for(int i=0;i<m.length;i++) {
		if(m[i]!=null) {
			System.out.println(m[i].toString());
		}
}
	//2���� ��� ���
	for(Memo im:m) {
		if(im!=null) {
			System.out.println(im.toString());
		}
	}
		}
}

