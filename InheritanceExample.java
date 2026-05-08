package day13;

class CreditCard //Parent class
{
	//private -->Rule 1
	int cardnumber = 123456;
	//private 
	int pin = 11111;
}

class Hacker extends CreditCard//Child class
{
	void viewDetails()
	{
		System.out.println(cardnumber);
		System.out.println(pin);
	}
	
	void changeDetails() 
	{
		cardnumber = 292929; //Overriding variables
		pin = 22222;
	}
}


public class InheritanceExample {

	public static void main(String[] args) 
	{
		Hacker h = new Hacker();
		h.viewDetails();
		h.changeDetails();
		System.out.println("--------------------");
		h.viewDetails();
		
	}

}
