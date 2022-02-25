package pgm.type;

public class cast {

	public static void main(String[] args) 
	{
		int i = 100;
		long l = i;
		System.out.println("long value "+ l);
		
		int o =(int) l;
		System.out.println("int value "+ o);
		
		char t=(char) i;
		System.out.println("char value "+ t);
		
		double d= 8150011232.787990;
		float r= (float) d;
		System.out.println("float value "+r);
		System.out.println("double value "+d);
		
		
		double d2 = 8150011232.787990;
		long l2 = (long)d2;
		int i2 = (int)l2;
		System.out.println("Double value "+d2);
		System.out.println("Long value "+l2);
		System.out.println("Int value "+i2);
		
		
	

	}

}
