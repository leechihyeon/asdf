package basic220530;
class Car{
	public Car() {
		System.out.println("������ car����");
	}
	public void gear() {
		System.out.println("������ ����մϴ�.");
	}
}

class  ChildCar1 extends Car{
	public ChildCar1() {
		System.out.println("childcar1������ȣ��");
	}
	public void autoGear() {
		
		System.out.println("�ڵ��� ����մϴ�.");
	}
}

class ChildCar2 extends ChildCar1{
	public ChildCar2() {
		System.out.println("childcar2������ȣ��");
	}
	public void hybrid() {
		System.out.println("���̺긮�� ����Դϴ�.");
	}
	public void autoGear() {
		//super.autoGear();"{//super�� �θ�ü�� �����ϴ� Ű�����.
		System.out.println("���ڵ��� ����մϴ�.");
	}
}
public class CarTest {

	public static void main(String[] args) {
		//Car car=new Car() car.gear();
		//new Car().gear();
		//ChildCar1 cc1=new ChildCar1();
		//cc1.gear();
		//cc1.autoGear();
		ChildCar2 cc2=new ChildCar2();
		cc2.gear();
		cc2.autoGear();
		
		cc2.hybrid();

	}

}
