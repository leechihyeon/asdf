package basic220519;

public class Carlnfo {
//������,cc,����,ž���ο�,�����ִ�ӵ�
String cname;
int cc;
double price;
int person;
int speed;
//������ �̸�,��ȭ��ȣ
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
	System.out.println("������:"+cname);
	System.out.println("��ⷮ:"+cc+"cc");
	System.out.println("����:"+price+"����");
	System.out.println("ž���ִ��ο�:"+person+"��");
	System.out.println("�ӵ�:"+speed+"km");
}

void buyInfo() {
	System.out.println("�����ڸ�:"+name);
	System.out.println("��ȭ��ȣ"+tel);
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



