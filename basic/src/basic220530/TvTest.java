package basic220530;

class TV{
	int size;
	public TV() {
		
	}
	public TV(int size) {
		this.size=size;
	}

	public int getSize() {
		return size;
	}
	
}
class ColorTV extends TV{
	int color;
	public ColorTV() {
	}
	public ColorTV (int size,int color) {
		this.size=size;
		this.color=color;
	}
	public int getColor() {
		return color;
	}
	public void print() {
		System.out.println(getSize()+"인치,"+getColor()+"컬러");
	}
}
class IPTV extends ColorTV{
	String ip;
	public IPTV() {
		
	}
	public IPTV(String ip,int size,int color) {
		this.ip=ip;
		this.size=size;
		this.color=color;
	}
	public String getIp() {
		return ip;
	}
	public void print() {
		System.out.println("ip"+getIp()+","+getSize()+"인치,"+getColor()+"컬러");
	}
}

public class TvTest {
	public static void main(String[] args) {
		(new IPTV("192.168.0.10",55,1024)).print();
	}
}