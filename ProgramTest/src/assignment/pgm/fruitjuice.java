package assignment.pgm;
import java.util.Scanner;

public class fruitjuice {

		private int product_code;
		private String flavour;
		private String pack_type;
		private int pack_size;
		private int product_price;
		
		
		public fruitjuice()
		{
			product_code=0;
			flavour="";
			pack_type="";
			pack_size=0;
			product_price=0;
			
		}
		public void input() {
			Scanner in=new Scanner(System.in);
			System.out.println("enter flavour:");
			flavour=in.nextLine();
			System.out.println("enter pack type:");
			pack_type=in.nextLine();
			System.out.print("enter product code:");
			product_code=in.nextInt();
			System.out.print("enter pack size:");
			pack_size=in.nextInt();
			System.out.print("enter product price:");
			product_price=in.nextInt();
			
}
		public void discount()
		{
			product_price-=10;
			
		}
		public void display() {
			System.out.println("product code:"+product_code);
			System.out.println("flavour:"+flavour);
			System.out.println("pack_type:"+pack_type);
			System.out.println("pack size:"+pack_size);
			System.out.println("product price:"+product_price);
		}
		public static void main(String args[]) {
			fruitjuice ob=new fruitjuice();
			ob.input();
			ob.discount();
			ob.display();
		}

}
