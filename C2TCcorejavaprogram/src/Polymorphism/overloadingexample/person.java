package Polymorphism.overloadingexample;

public class person {

	private int pid;
	private String name;
	private String city ;
	
	public person()
	{

this.pid=100;
this.name="arun";
this.city="chennai";
	}
public person(int pid ,String name)
{
this.pid=pid;
this.name="jeni";
this.city="puduchery";

}
public person(int pid ,String name,String city)
{
this.pid=pid;
this.name=name;
this.city=city;

}
@Override
public String toString() {
	return "person [pid=" + pid + ", name=" + name + ", city=" + city + "]";
}




}