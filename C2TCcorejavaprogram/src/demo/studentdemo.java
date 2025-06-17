package demo;

public class studentdemo {
 
	public static void main(String[]args) {
	   student stn = new student();
		stn.setId(101);
		stn.setName("john");
		stn.setAge(20);
		
		System.out.println(stn);
		  
		System.out.println("ID:"+stn.getId());
		System.out.println("Name:"+stn.getName());
		System.out.println("Age:"+stn.getAge());
		
		
		
		
		customer c = new customer();
		c.setName("John");
		System.out.println(c);
	}

}
