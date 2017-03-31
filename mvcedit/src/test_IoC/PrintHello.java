package test_IoC;

public class PrintHello {
	private int a;
	private String s;
	
	public PrintHello(String s){
		this.s=s;
	}
	
	public void print(){
		System.out.println("a = " + a);
		System.out.println("s = " + s);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public void init(){
		System.out.println("destroy");
	}
	

	

}
