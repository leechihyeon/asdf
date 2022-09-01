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
	System.out.println("이름:"+name);
	System.out.println("전화번호:"+tel);
	System.out.println("메모:"+memo);
}

public void remove() {
	
	this.name=" ";
	this.tel=" ";
	this.memo=" ";
	System.out.println("전화번호부가 삭제되었습니다.");
}
public void update(String name, String tel, String memo) {

	
}
}
