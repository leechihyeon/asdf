package basic220530;
class Movie{
		String part="��ȭ";
}
class korea extends Movie{
	String m1="������ ����";
}

class foreign extends Movie{
	String m2="�����̴���";
}
public class MovieTest {

	public static void main(String[] args) {
		korea k=new korea();
		System.out.println("�帣"+k.part);
		System.out.println("�帣"+k.m1);
		
		
		
	}

}
