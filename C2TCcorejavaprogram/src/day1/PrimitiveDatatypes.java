package day1;

public class PrimitiveDatatypes {

	public static void main(String[]args) { 
		byte byteMax = 127 ;
		byte byteMin =-128;
		System.out.println("Min range of byte is"+
		byteMin+"Max range of byte is "+byteMax);
		
		short shortMax = 32767;
		short shortMin = -32768;
		
		System.out.println("Minshort range of byte is" +
		shortMin +"Maxshort range of byte is "+shortMax);
		
		int MaxInt = 2147483647;
		int MinInt = -214783648;
		System.out.println("Minint range of byte is" +
		              MinInt+ "Maxint range of byte is"+ MaxInt);
		
		Long maxLong =9223372036854775807L;
		Long minLong = -9223372036854775807L;
		
		System.out.println("Minlong range of byte is"+
		                   minLong +"Maxlong range of byte is "+ maxLong);
		                   float f = 3234.141243278345f;
		                   double d= 3456.14124512345678902345678914f;
		                   System.out.println("float value is "+f+"double valueis"+d);
		                		   
		                		   boolean flag=false;
		                		   System.out.println("boolean value is "+flag);
	}
}