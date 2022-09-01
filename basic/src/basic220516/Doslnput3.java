package basic220516;

import java.text.DecimalFormat;

public class Doslnput3 {

	public static void main(String[] args) {
		int price=10000000;
		DecimalFormat f = new DecimalFormat("#,##");
		String p=f.format(price);
		System.out.println(p);
	}

}
