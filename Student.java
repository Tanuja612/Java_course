package day8;
class Test
{
	String name1="tanu";
	int marks1=80;
	String name2="dhanu";
	int marks2=90;
}

public class Student {
	public static void main(String[] args)
	{
		Test s1=new Test();
		Test s2=new Test();
		System.out.println("--student 1----");
		System.out.println(s1.name1);
		System.out.println(s1.marks1);
		System.out.println("--student 2----");
		System.out.println(s2.name2);
		System.out.println(s2.marks2);
	}

}
