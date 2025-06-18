package day4;

public class Myclassdemo {

	public static void main(String[]args) {
		Myclass st = Myclass.getObj();
		
		st.setSid(101);
		st.setName("jenifer");
		
		Myclass st1 = Myclass.getObj();
		System.out.println(st1);
	     System.out.println(st);

}
	}
