package day9;

import java.util.Scanner;

public class onedimensionalarray {

	public static void main(String[] args)
	{
		int age[]=new int[5];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<age.length;i++)
		{
			System.out.println("Enter the age of student"+i);
			age[i]=s.nextInt();
			
        }
			System.out.println("the age of students are: ");
			for(int i=0;i<age.length;i++)
			{
				System.out.println(age[i]);
			}
     }
}


