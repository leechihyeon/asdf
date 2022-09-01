package basic220531;

public class Cal implements CalInterface{

	@Override
	public int add(int x, int y) {
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		return x-y;
	}
	@Override
	public int mux (int x, int y) {
		return x*y;
	}

	@Override
	public float div(int x, int y) {
		// TODO Auto-generated method stub
		return (float)x/y;
	}

	
}
