package basic220531;
class AA extends AbstractA{

	@Override
	public void print() {
		System.out.println("^^^^^^^^^^^^^^^");
		
	}


}
public abstract class AbstractA {
	
	public void display() {
		System.out.println("******************");
	}
	public abstract void print();
	
}
