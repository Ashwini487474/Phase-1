package assignment.pgm;
import java.util.Scanner;

public class Grade_Revision {
	private String name;
	private int bas;
	private int expn;
	private double inc;
	private double nbas;
	
	
	public Grade_Revision() {
		name="";
		bas=0;
		expn=0;
		inc=0.0;
		nbas=0.0;
		
	}
	public void accept() {
		Scanner in=new Scanner(System.in);
		System.out.println("enter name:");
		name=in.nextLine();
		System.out.println("enter basic:");
		bas=in.nextInt();
		System.out.println("enter experience:");
		expn=in.nextInt();
	}
	public void increment() {
		if(expn<=3)
			inc=1000+(bas*0.1);
		else if(expn<=5)
			inc=3000+(bas*0.12);
		else if(expn<=10);
		    inc=5000+(bas*0.15);
		    else
			inc=8000+(bas*0.2);
		nbas=bas+inc;
	}
	public void display() {
		System.out.println("name:"+name);
		System.out.println("basic:"+bas);
		System.out.println("experience:"+expn);
		System.out.println("increment:"+inc);
		System.out.println("new basic:"+nbas);
	}
	public static void main(String args[]) {
		Grade_Revision ob=new Grade_Revision();
		ob.accept();
		ob.increment();
		ob.display();
		
	}
	

}
