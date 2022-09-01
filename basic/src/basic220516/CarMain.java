package basic220516;
class Car	{
	String cname;
	int cc;
	int price;
	int person;
	int speed;
	String name;
	int tel;
	
	public Car(String Car) {
	}
	public Car(String string, int i, int j, int k, int l, String string2, int m) {
		
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
}
public class CarMain {
	public static void main(String[] args) { 
		Car car=new Car("cname", 2000, 5, 3, 2, "º¥Ã÷", 51759222);
		//pay.name="È«±æµ¿";
		car.setCar("");
		System.out.println(car.getName());
		


	
	
	
	}
	
	
}



