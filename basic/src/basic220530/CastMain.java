package basic220530;
class My{
	String name;
	public My() { }
	public My(String name) { this.name=name; }
	public void print() {
		System.out.println("My name is"+name);
	}
}

class Myup extends My{
	int age;
	public Myup() { }
	public Myup(String name, int age) {
		this.name=name;
		this.age=age;
	}
	public void printup() {
		System.out.println("My name is"+name);
		System.out.println("My age is"+age);
	}
	
}
public class CastMain {

	public static void main(String[] args) {
		//test1-형변환테스트:부모는 자식의 일부를 받을 있음		
		//My my=new My("홍길동");
		//Myup myup=new Myup("이길동",20);
		//my=myup;//부모는 자식에게서 부모만큼의 공간을 가져올 수 있다.
		
		//test2-자식안에 부모를 넣으려면 이미 자식이 부모것을 상속받았으므로
		//형변환이 이루어지지 않음
		//My my=new My("홍길동");
		//Myup myup=new Myup("이길동",20);
		//myup=my;//(x)자식의 공간은 고유공간이 아니므로 형변환을 할 수 없다.
		
		//test3 형변환한 객체는 자식의 함수를 사용할 수  없음
		//My my1=new Myup("서길동",30);
		//my1.print();//(o)
		//my1.printup();//(x)
		
		//test4-형변환이 가능한지 확인하는 연산자 instaceof
		//사용법 : 객체변수 instanceof 클래스명->true 또는 false반환
		//형변환이 가능하면 true, 그렇지 않으면 false반환
		//My my1=new Myup("서길동",30);
		//System.out.println(my1 instanceof Myup);
		
		
		
		
		
		
		//myup=my;
		
//		My m1=new My("홍길동");
//		My m2=new My("홍이동");
//		m1.print();
//		m2.print();
//		m2=m1;
//		m1.print();
//		m2.print();
	}

}
