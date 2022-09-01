package basic220519;

import java.io.IOException;
import java.util.Scanner;

public class PhonebookMain {

	public static void main(String[] args) throws IOException{
		
		Scanner scan=new Scanner(System.in);
		Phonebook[] pb =new Phonebook[100];//저장할 공간 100개 배열선언
		int index=0; //저장할 위치 초기값
		int select=0;//메뉴번호를 선택하기 위한 변수
		String search=null;
		String name=null;
		String tel=null;
		String memo=null;
		
		while(true) {
		menu();
		select=scan.nextInt();
		screenclear();
		switch(select) {
		case 1 : 
			System.out.println("이름을 입력하세요.");
			System.out.println("입력을 취소하시려면 exit를 입력하세요.");
			name=scan.next();
			if(name.equals("exit")) {
				break;
			}
			System.out.println("전화번호를 입력하세요.");
			tel=scan.next();
			if(tel.equals("exit")) {
				break;
			}
			System.out.println("메모를 입력하세요.");
			memo=scan.next();
			if(memo.equals("exit")) {
				break;
			}
			pb[index]=new Phonebook(name,tel,memo);
			index=index+1;
			break;
		
		case 2 :
			for(int i=0;i<index;i++) {
				if(!pb[i].name.equals(" ")) {
			pb[i].view(); 
				}
			}
			System.in.read();
			break;
		case 3 :  
			System.out.println("검색할 이름을 입력하세요.");
			search=scan.next();
			for(int i=0;i<index;i++) {
				if(search.equals(pb[i].name)) {
					pb[i].view();
					break;
				}
				if(i==index-1) {
					System.out.println("검색할 이름이 없습니다.");
				}
			}
			System.in.read();
			break;
		case 4 :  
			//수정은 먼저 데이터 찾고(이름을 검색하여 index를 찾는다)
			//수정할 데이터를 입력받고
			//수정할 데이터를 객체에 다시 저장
			System.out.println("수정할 데이터의 검색 이름을 입력하세요.");
			search=scan.next();
			for(int i=0;i<index;i++) {
				if(search.equals(pb[i].name)) {
					int searchindex = i;
					System.out.println("수정할 이름을 입력하세요.");
					name=scan.next();
					System.out.println("전화번호를 입력하세요.");
					tel=scan.next();
					System.out.println("메모를 입력하세요.");
					memo=scan.next();
					pb[searchindex].update(name,tel,memo);
					break;
				}
				if(i==index-1) {
					System.out.println("검색할 이름이 없습니다.");
				}
			}
			
			break;
		case 5 :
			System.out.println("삭제할  이름을 입력하세요.");
			search=scan.next();
			for(int i=0;i<index;i++) {
				if(search.equals(pb[i].name)) {
					pb[i].remove();
					break;
				}
				
				if(i==index-1) {
					System.out.println("삭제할 이름을 찾을 수 없습니다.");
				}
			}
			break;
			
			
			
			
			
			
			
			
			
		case 0 : 
			System.out.println("프로그램을 종료합니다.");
			System.exit(0); break;
		}
		}//end while
	}
	
	static void screenclear() {
		for(int i=0;i<80;i++) {
			System.out.println("");
		}
	}

	static void menu() {
		System.out.println("-----------------------------");
		System.out.println("      전화번호부 메뉴       ");
		System.out.println("-----------------------------");
		System.out.println("   1. 전화번호부 입력    ");
		System.out.println("   2. 전화번호부 전체 출력    ");
		System.out.println("   3. 전화번호부 검색    ");
		System.out.println("   4. 전화번호부 수정    ");
		System.out.println("   5. 전화번호부 삭제    ");
		System.out.println("   0. 프로그램 종료    ");
		System.out.println("-----------------------------");
	}
}
