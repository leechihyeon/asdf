package basic220519;

public class Carlnfo {
//차량명,cc,가격,탑승인원,차량최대속도
String cname;
int cc;
double price;
int person;
int speed;
//구매자 이름,전화번호
String name;
String tel;
Carlnfo(){}
Carlnfo(String cname,int cc,double price,int person,int speed) {
	
	this.cname=cname;
	this.cc=cc;
	this.price=price;
	this.person=person;
	this.speed=speed;
}
void CarContent(){
	System.out.println("차량명:"+cname);
	System.out.println("배기량:"+cc+"cc");
	System.out.println("가격:"+price+"만원");
	System.out.println("탑승최대인원:"+person+"명");
	System.out.println("속도:"+speed+"km");
}

void buyInfo() {
	System.out.println("구매자명:"+name);
	System.out.println("전화번호"+tel);
}
void buyChange(String name, String tel) {
	this.name=name;
	this.tel=tel;
}




public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCc() {
	return cc;
}
public void setCc(int cc) {
	this.cc = cc;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public int getPerson() {
	return person;
}
public void setPerson(int person) {
	this.person = person;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}

		
	}



