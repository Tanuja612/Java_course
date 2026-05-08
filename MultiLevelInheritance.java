package day13;

class Demo  extends Test
{ 
	void add()
	{
		int a = 10;
		int b = 20;
		int sum = a+b;
		System.out.println(sum);
	}
}
class Test  extends Demo{
	void fun()
	{
		System.out.println("Hello");
	}
}

class Demo1 extends Demo
{   
	void subtract()
	{
		int a = 10;
		int b = 20;
		int sub = a-b;
		System.out.println(sub);
	}
}
class Demo2 extends Demo1
{

	void Mul()
	{
		int a = 10;
		int b = 20;
		int multi  = a*b;
		System.out.println(multi);
	}
}
public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		Demo2 d2 = new Demo2();
		d2.add();
		d2.Mul();
		d2.subtract();
		

	}

}
