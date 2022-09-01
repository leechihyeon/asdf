package basic220531;
 
class Car{
	public void name(String name) {
		System.out.println("자동차명:"+name);
	}
	public void CC(int CC) {
		System.out.println("배기량은:"+CC);
	}
	public void year(int year) {
		System.out.println("년식은:"+year);
	}
}
public class CarFunc implements CarFuncInterface {
	public static void main(String[] args) {
	
	}

	@Override
	public void movehandle() {
		System.out.println("핸들조작");
	}
	@Override
	public void controllerAcc() {
		System.out.println("엑셀레이터조작");
		
	}

	@Override
	public void contrllerBreak() {
		System.out.println("브레이크조작");
		
	}

	@Override
	public void controllerWindow() {
		System.out.println("창문조작");
		
	}

	CarFunc carfunc=new CarFunc();
	name=pony


}
