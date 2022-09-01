package basic220530;
class Movie{
		String part="영화";
}
class korea extends Movie{
	String m1="가문의 위기";
}

class foreign extends Movie{
	String m2="스파이더맨";
}
public class MovieTest {

	public static void main(String[] args) {
		korea k=new korea();
		System.out.println("장르"+k.part);
		System.out.println("장르"+k.m1);
		
		
		
	}

}
