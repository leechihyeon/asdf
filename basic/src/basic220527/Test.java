package basic220527;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//문제1.
//int a=10; 
/*문제2
int b=11;
int c=12;
int d=13;
int e=14;
*/
//문제3
//int[] aa_array = {10,11,12,13,14};
//문제4
//구현이 쉽고 연속된 메모리 공간에 존재하기 때문에 관리하기가 편하다.
//문제5
//String s="Hello";
//문제6
String ss[]= {"hello111","hello2111","hello3111","hello4","hello5"};
System.out.println();


/*	for(int i=0;i<ss.length;i++) {
		ss[i]
	}
//문제7
class Memo{
	int num;
char content;*/
		//forEach출력 (일반 객체 배열에서는 사용할 수 없으며
		//컬렉션객체에만 사용이 가능한 문법 
	List<String> list=new ArrayList<>();
	list.add("hello1");
	list.add("hello2");
	list.add("hello3");
	list.add("hello4");
	list.add("hello5");
	
	System.out.println("forEach람다식");
	list.forEach(imsi1->System.out.println(imsi1));
	list.forEach(System.out::println);
	
	Memo m2=new Memo();
	System.out.println(m2.toString());
	
	Memo m1=new Memo(1,"java study");
	System.out.println(m1.toString());
	
	//클래스를 배열로 new객체를 선언하는 것은 객체생성을 하는 것이아니고
	//배열공간을 확보하기 위한 작업이다.
	Memo m[]=new Memo[5];
	m[0]=new Memo(1,"java");
	m[1]=new Memo(2,"html");
	m[2]=new Memo(3,"javascript");
	//인덱스 값을 0,3을 입력하여 테스트 하세요.
	if(m[3]!=null) {
		System.out.println("메모 객체가 생성되어 있습니다.");
	}else {
		System.out.println("메모 객체가 생성되어 있지 않습니다.");
	}
	
	for(int i=0;i<m.length;i++) {
		if(m[i]!=null) {
			System.out.println(m[i].toString());
		}
}
	//2번쨰 출력 방법
	for(Memo im:m) {
		if(im!=null) {
			System.out.println(im.toString());
		}
	}
		}
}

