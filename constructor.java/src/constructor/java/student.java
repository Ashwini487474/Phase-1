package constructor.java;

public class student {

	 String name;
	 int age;
	 char gender;
	 char section;
	 int m1,m2,m3;
	 int total;
	 double average;
	 public student(string n, int a, int s1, int s2, int s3, int t, double average, )
	 {
		 name = n;
		 m1 = s1 = 55;
		 m2 = s2 = 34;
		 m3 = s3 = 65;
		 age = a;
	 }
	 public void accept() {
		 System.out.println("enter name: ");
		 name = In.nextline();
		 System.out.println("enter age: ");
		 age = In.nextint();
		 System.out.println("enter subject 1 marks: ");
		 m1 = In.nextint();
		 System.out.println("enter subject 2 marks: ");
		 m2 = In.nextint();
		 System.out.println("enter subject 3 marks: ");
		 m3 = In.nextint();
		 
		 
	 }
	 public void compute()
	 {
		 total=m1+m2+m3;
		 average = (m1+m2+m3)/3;
	 }
	 public void display()
	 {
		 System.out.println("name: " + name);
		 System.out.println("age: " + age);
		 System.out.println("gender: " + gender);
		 System.out.println("subject 1 marks: " + m1);
		 System.out.println("subject 2 marks: " + m2);
		 System.out.println("subject 3 marks: " + m3);
		 System.out.println("total marks: " + total);
		 System.out.println("average marks: " + average);
		 
	 }
	 public static void main(String args[]) {
		 student obj = new student();
		 obj.accept();
		 obj.compute();
		 obj.display();
	 }
	 
	 
		
		

	}


