package basic220531;

public class LgButton implements Button{
int speed;
String dry;

LgButton(){
	
}

LgButton(String dry){
	this.dry=dry;
}

public void print() {
	System.out.println("����� ���");
}


	
	@Override
	public void startButton() {
		System.out.println("����");
		
	}

	@Override
	public void stopButton() {
		System.out.println("����");
		
	}

	@Override
	public void pauseButton() {
		System.out.println("����");
		
	}

	@Override
	public void changeButton(int speed) {
		if(speed>=10&& speed<100) {
		System.out.println("�ӵ�����"+speed+"�� ����Ǿ����ϴ�.");
		}else {
			System.out.println("LG��Ź�� �ӵ� �ٽ� Ȯ���ض�");
		}
	}



}
