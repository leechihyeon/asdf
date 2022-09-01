package basic220519;

public class CarManager {

	public static void main(String[] args) {
		/*Carlnfo ci=new Carlnfo("gv80",3000,100,7,300);
		ci.CarContent();
		ci.buyInfo();
		ci.buyChange("홍길동","010-1111-1111");
		ci.buyInfo();
	 */
		Carlnfo[] ci=new Carlnfo[10];
		ci[0]=new Carlnfo("gv80",3000,100,7,300);
		ci[1]=new Carlnfo("소나타",3000,300,5,250);
		ci[2]=new Carlnfo("포터",3000,400,4,200);
		ci[3]=new Carlnfo("코란도",3000,500,4,300);
		for(int i=0;i<ci.length;i++) {
		ci[i].CarContent();
		ci[i].buyInfo();
		
		}

}
}