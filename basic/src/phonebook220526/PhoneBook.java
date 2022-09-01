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
	System.out.println("이름:"+name);
	System.out.println("전화번호:"+tel);
	System.out.println("메모:"+memo);
}

public void update(String name, String tel, String memo) {
	this.name=name;
	this.tel=tel;
	this.memo=memo;
	System.out.println("전화번호부가 수정 되었습니다.");
}

public void remove() {
	this.name="";
	this.tel="";
	this.memo="";
	System.out.println("전화번호가 삭제되었습니다.");
}


}
