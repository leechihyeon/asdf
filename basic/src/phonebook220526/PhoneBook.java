package phonebook220526;

public class PhoneBook {
String name;
String tel;
String memo;

public PhoneBook() {
}
public PhoneBook(String name, String tel, String memo) {
	this.name = name;
	this.tel = tel;
	this.memo = memo;
}

@Override
public String toString() {
	return "PhoneBook [name=" + name + ", tel=" + tel + ", memo=" + memo + "]";
}

void view() {
	System.out.println("�̸�:"+name);
	System.out.println("��ȭ��ȣ:"+tel);
	System.out.println("�޸�:"+memo);
}

public void update(String name, String tel, String memo) {
	this.name=name;
	this.tel=tel;
	this.memo=memo;
	System.out.println("��ȭ��ȣ�ΰ� ���� �Ǿ����ϴ�.");
}

public void remove() {
	this.name="";
	this.tel="";
	this.memo="";
	System.out.println("��ȭ��ȣ�� �����Ǿ����ϴ�.");
}


}
