package basic220519;

public class Phonebook {
String name;
String tel;
String memo;

Phonebook() { }
Phonebook(String name, String tel, String memo){
	this.name=name;
	this.tel=tel;
	this.memo=memo;
}

void view() {
	System.out.println("�̸�:"+name);
	System.out.println("��ȭ��ȣ:"+tel);
	System.out.println("�޸�:"+memo);
}

public void remove() {
	
	this.name=" ";
	this.tel=" ";
	this.memo=" ";
	System.out.println("��ȭ��ȣ�ΰ� �����Ǿ����ϴ�.");
}
public void update(String name, String tel, String memo) {

	
}
}
