package Polymorphism.overloadingexample;

public class Executor{
	public static void main (String[]args) {
		System.out.println("1.Addition:"+overloadingexample.addition("hello","world"));
		System.out.println("2.Addition:"+overloadingexample.addition(12,100));
		System.out.println("3.Addition:"+overloadingexample.addition(10,4.67f));
		System.out.println("4.Addition:"+overloadingexample.addition(35.8f,11));
		System.out.println("5.Addition:"+overloadingexample.addition(17.5f,14.2f));
		
		{	
		person p1=new person();
		System.out.println(p1);
		
		p1= new person(101,"Hema");
		System.out.println(p1);
		
		p1 = new person(102,"ester","bangalore");
		System.out.println(p1);
		
	}
	}
}