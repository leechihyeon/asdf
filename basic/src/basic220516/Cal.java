package basic220516;
// �� ���� ����ϴ� ���⸦ ���弼��.
public class Cal {
	int su1;
	int su2;
	float result;
	
	Cal(){
		System.out.println("alert:���� ������");
	}
	//Cal
	Cal(int su1,int su2, char op){
		this.su1=su1;
		this.su2=su2;
		
		switch(op) {
		case '+' : this.result=this.su1+this.su2; break;
		case '-' : this.result=this.su1-this.su2; break;
		case '*' : this.result=this.su1*this.su2; break;
		case '/' : this.result=(float)this.su1/this.su2; break;
		default: System.out.println("�����ڸ� Ȯ���ϼ���.");
		
		
		}
	}
	
	
	void setResult(float result) {
		this.result=result;
	}
	
	float getResult() {
		return result;
	}
	
	int plus(int su1,int su2) {
		return su1+su2;
	}
	
	int minus(int su1,int su2) {
		return su1-su2;
		
	}
	
	int mux(int su1,int su2) {
		return su1*su2;
	}
	
	float div(int su1,int su2) {
		return (float)(su1+su2)/2;
	}
	
	void print() {
		System.out.println("������:"+result);	
	}
	
}
