package phonebook220526;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TotalPhonebookMain {

	public static void main(String[] args) throws IOException{
		
		Scanner scan=new Scanner(System.in);
		PhoneBook[] pb =new PhoneBook[100];//저장할 공간 100개 배열선언
		int index=0; //저장할 위치 초기값
		int select=0;//메뉴번호를 선택하기 위한 변수
		String search=null;
		String name=null;
		String tel=null;
		String memo=null;
		//파일로 부터 데이터를 읽어와 객체를 메모리에 로드
		/* *******file upload********* */
		File f1=new File("phonebook.txt");
		FileReader f2=new FileReader(f1);
		BufferedReader f3=new BufferedReader(f2);
		String imsi=null;
		//파일로 부터 데이터를 읽어오고
		//문자열을 다시 스페이스로 분리하여 배열에 넣고
		//배열의 값을 객체를 생성하는데 사용
		while((imsi=f3.readLine())!=null) {
			String arr[]=imsi.split(" ");
			pb[index]=new PhoneBook(arr[0],arr[1],arr[2]);
			index++;
		}
		f3.close();
		f2.close();
		
		/* **** file upload end ******/
		
		while(true) {
		menu();
		select=scan.nextInt();
		//screenclear();
		switch(select) {
		case 1 : 
			System.out.println("이름을 입력하세요.");
			name=scan.next();
			
			System.out.println("전화번호를 입력하세요.");
			tel=scan.next();
			
			System.out.println("메모를 입력하세요.");
			memo=scan.next();
			
			pb[index]=new PhoneBook(name,tel,memo);
			index=index+1;
			break;
			
		case 2 :
			for(int i=0;i<index;i++) {
				if(pb[i]!=null) {
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
					//System.out.println(pb[i].toString());
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
					System.out.println("수정할 이름을 입력하세요.");
					name=scan.next();
					System.out.println("전화번호를 입력하세요.");
					tel=scan.next();
					System.out.println("메모를 입력하세요.");
					memo=scan.next();
					pb[i].update(name,tel,memo);
					break;
				}
				if(i==index-1) {
					System.out.println("검색할 이름이 없습니다.");
				}
			}
			
			break;
		case 5:
			System.out.println("삭제할 이름을 입력하세요.");
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
		
		case 6: //데이터 불러오기
			System.out.println("불러올 파일명을 입력하세요;");
			String filename=scan.next();
			f1=new File(filename);
			if(!f1.exists()) {
				System.out.println("파일이 존재하지 않습니다.");
				break;
			}
			
			
			f2=new FileReader(f1);
			f3=new BufferedReader(f2);
			imsi=null;
			index=0;
			//pb[100]개의 객체배열을 null값으로 초기화
			for(int k=0;k<pb.length;k++) {
				pb[k]=null;
			}
			
			while((imsi=f3.readLine())!=null) {
				String arr[]=imsi.split(" ");
				pb[index]=new PhoneBook(arr[0],arr[1],arr[2]);
				index++;
			}
			f3.close();
			f2.close();
			break;
		
		case 7: //데이터 저장하기
			FileWriter f4=new FileWriter(f1);
			BufferedWriter f5=new BufferedWriter(f4);
			
			//메모리->파일에 쓰는 작업을 진행
			
			String str="";
			for(int j=0;j<index;j++) {
				if(!pb[j].name.equals("")) {
					if(j==index-1) {
						str=pb[j].name+" "+pb[j].tel+" "+pb[j].memo;
					}else {
				str=pb[j].name+" "+pb[j].tel+" "+pb[j].memo+"\n";
					}
				f5.write(str);
				f5.flush();
				}
			}
			f5.close();
			f4.close();
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
		System.out.println("   6. 데이터 불러오기    ");
		System.out.println("   7. 데이터 저장    ");
		System.out.println("   0. 프로그램 종료    ");
		System.out.println("-----------------------------");
	}
}
