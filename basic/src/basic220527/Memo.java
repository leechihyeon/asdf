package basic220527;

public class Memo {
int num;
String content;
public Memo() {
	
}
public Memo(int num, String content) {
	this.num = num;
	this.content = content;
}
@Override
public String toString() {
	return "Memo [num=" + num + ", content=" + content + "]";
}
}
