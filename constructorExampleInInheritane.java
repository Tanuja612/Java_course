package day13;
class object{
	object()
	{
	}
}
class Test1 extends object 
{
	int x,y;
	 Test1()
	 {
		 x=100;
		 y=200;
	}
	 Test1(int x,int y)
	 {
		 super();
		 this.x=x;
		 this.y=y;
	 }
}
class Test2 extends Test1
{
	int a,b;
	Test2()
	{
		a=300;
		b=400;
		
	}
	Test2(int a,int b)
	{
		super();
		this.a=a;
		this.b=b;
	}
}

public class constructorExampleInInheritane {
	public static void main(String[] args)
	{
		Test2 t2= new Test2(1000,2000);
		System.out.println(t2.a);
		System.out.println(t2.b);
		System.out.println(t2.x);
		System.out.println(t2.y);
		
		
	}

}
