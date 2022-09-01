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
	System.out.println("드라이 기능");
}


	
	@Override
	public void startButton() {
		System.out.println("시작");
		
	}

	@Override
	public void stopButton() {
		System.out.println("중지");
		
	}

	@Override
	public void pauseButton() {
		System.out.println("정지");
		
	}

	@Override
	public void changeButton(int speed) {
		if(speed>=10&& speed<100) {
		System.out.println("속도변경"+speed+"로 변경되었습니다.");
		}else {
			System.out.println("LG세탁기 속도 다시 확인해라");
		}
	}



}
