package basic220516;

public class IntArray {

	public static void main(String[] args) { 
		//int[][] position= {{10,20},{30,40},{50,60}};//int[3][2]
		int[][] position= {{10,20,30},{30,40,70},{50,60,110}};//int[3][3]
		
		for(int row=0;row<position.length;row++) {
			System.out.println(position[row][0]);
			System.out.println(position[row][1]);
			//System.out.println(position[row][2]);
		}
		
		String s="abc";
		System.out.println(s);
		System.out.println(s.toString());
	}
}
