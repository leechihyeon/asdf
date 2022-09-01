package basic220530;
class Car{
	public Car() {
		System.out.println("생성자 car생성");
	}
	public void gear() {
		System.out.println("수동기어를 사용합니다.");
	}
}

class  ChildCar1 extends Car{
	public ChildCar1() {
		System.out.println("childcar1생성자호출");
	}
	public void autoGear() {
		
		System.out.println("자동기어를 사용합니다.");
	}
}

class ChildCar2 extends ChildCar1{
	public ChildCar2() {
		System.out.println("childcar2생성자호출");
	}
	public void hybrid() {
		System.out.println("하이브리드 기어입니다.");
	}
	public void autoGear() {
		//super.autoGear();"{//super는 부모객체를 지정하는 키워드다.
		System.out.println("뉴자동기어를 사용합니다.");
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
