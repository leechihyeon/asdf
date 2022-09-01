package basic220531;

class Func{
	String func1() {
		return "10";
	}
}

public class FuncTest {

	public static void main(String[] args) {
		Func f=new Func();
		System.out.println(f.func1());
	}

}
