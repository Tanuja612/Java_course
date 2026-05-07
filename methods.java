package day10;

public class methods {
	//with parameter and with return
	int add(int a,int b)
	{
		return a+b;
	}
	//with parameter and no return
	void subtract(int a,int b)
	{
		System.out.println("SUBTRACT: "+(a-b));
	}
	//without parameter and without return
	void mul()
	{
		int a=5;
		int b=10;
		int result=a*b;
		System.out.println(result);
	}
	//without parameter and with return
	int div()
	{
		int n1=100;
		int n2=10;
		return n1/n2;
	}
	public static void main(String[] args)
	{
		
	}

}
