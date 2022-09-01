package basic220516;
class Pay{
	private String name;
	public int bonbong;
	
	void setName(String name) {
		this.name=name;
	
	}
		String getName() {
			return this.name;
		}
}




public class PayMain {

	public static void main(String[] args) {
		Pay pay=new Pay();
		//pay.name="ȫ�浿";
		pay.setName("ȫ�浿");
		//System.out.println(pay.name);
		System.out.println(pay.getName());
		pay.bonbong=1000000000;
		
	}
}

