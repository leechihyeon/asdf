package basic220531;
abstract class SPanel{
	public void on() {
		System.out.println("panelÀ» ÄÕ´Ï´Ù.");
	}
	public void off() {
		System.out.println("panelÀ» ²ü´Ï´Ù.");
	}
	public abstract void logo();
}

class Company1 extends SPanel{

	@Override
	public void logo() {
		System.out.println("company1 logo");
		
	}
	
}

class Company2 extends SPanel{

	@Override
	public void logo() {
		System.out.println("company2 logo");
		
	}
}

public class PanelMain {

	public static void main(String[] args) {
		Company1 com1=new Company1();
		Company2 com2=new Company2();
		com1.on();com1.off(); com1.logo();
		com2.on();com2.off();com2.logo();

	}

}
