package assignment;

public class addarr {

	public static void main(String[] args) {
		int[]a= {6,2,3};
		int b[]= {4,5,6};
		int c[]=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			c[i]=a[i]+b[i];
		}
		System.out.println("sum of two array");
		for(int j=0;j<=c.length-1;j++) {
			System.out.println(c[j]);
		}

	}

}
