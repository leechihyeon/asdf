package basic220520;

public class Movie {

String title;
int minute;
String act;

Movie(){ }
Movie(String title, int minute, String act){
	this.title=title;
	this.minute=minute;
	this.act=act;	
}
//("����:"+title+", �󿵽ð�"+minute+"��, �۰�:"+act)
public void print() {
	System.out.println("����:"+title,"�󿵽ð�"+minute+"��","�۰�:"+act);
}
public void update(String title, int minute, String act) {
	this.title=title;
	this.minute=minute;
	this.act=act;
	System.out.println("�����Ǿ����ϴ�.");
	
}


}
