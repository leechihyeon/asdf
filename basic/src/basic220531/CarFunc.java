package basic220531;
 
class Car{
	public void name(String name) {
		System.out.println("�ڵ�����:"+name);
	}
	public void CC(int CC) {
		System.out.println("��ⷮ��:"+CC);
	}
	public void year(int year) {
		System.out.println("�����:"+year);
	}
}
public class CarFunc implements CarFuncInterface {
	public static void main(String[] args) {
	
	}

	@Override
	public void movehandle() {
		System.out.println("�ڵ�����");
	}
	@Override
	public void controllerAcc() {
		System.out.println("��������������");
		
	}

	@Override
	public void contrllerBreak() {
		System.out.println("�극��ũ����");
		
	}

	@Override
	public void controllerWindow() {
		System.out.println("â������");
		
	}

	CarFunc carfunc=new CarFunc();
	name=pony


}
