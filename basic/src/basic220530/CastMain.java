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
		//test1-����ȯ�׽�Ʈ:�θ�� �ڽ��� �Ϻθ� ���� ����		
		//My my=new My("ȫ�浿");
		//Myup myup=new Myup("�̱浿",20);
		//my=myup;//�θ�� �ڽĿ��Լ� �θ�ŭ�� ������ ������ �� �ִ�.
		
		//test2-�ڽľȿ� �θ� �������� �̹� �ڽ��� �θ���� ��ӹ޾����Ƿ�
		//����ȯ�� �̷������ ����
		//My my=new My("ȫ�浿");
		//Myup myup=new Myup("�̱浿",20);
		//myup=my;//(x)�ڽ��� ������ ���������� �ƴϹǷ� ����ȯ�� �� �� ����.
		
		//test3 ����ȯ�� ��ü�� �ڽ��� �Լ��� ����� ��  ����
		//My my1=new Myup("���浿",30);
		//my1.print();//(o)
		//my1.printup();//(x)
		
		//test4-����ȯ�� �������� Ȯ���ϴ� ������ instaceof
		//���� : ��ü���� instanceof Ŭ������->true �Ǵ� false��ȯ
		//����ȯ�� �����ϸ� true, �׷��� ������ false��ȯ
		//My my1=new Myup("���浿",30);
		//System.out.println(my1 instanceof Myup);
		
		
		
		
		
		
		//myup=my;
		
//		My m1=new My("ȫ�浿");
//		My m2=new My("ȫ�̵�");
//		m1.print();
//		m2.print();
//		m2=m1;
//		m1.print();
//		m2.print();
	}

}
