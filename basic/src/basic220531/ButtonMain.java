package basic220531;

public class ButtonMain {

	public static void main(String[] args) {
		int speed=30;
		Samsung button=new Samsung();
		Button lg=new LgButton();
		button.print();
		lg.stopButton();
		lg.startButton();
		lg.changeButton(speed);
		
	
		
	}

}
