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
//("제목:"+title+", 상영시간"+minute+"분, 작가:"+act)
public void print() {
	System.out.println("제목:"+title,"상영시간"+minute+"분","작가:"+act);
}
public void update(String title, int minute, String act) {
	this.title=title;
	this.minute=minute;
	this.act=act;
	System.out.println("수정되었습니다.");
	
}


}
