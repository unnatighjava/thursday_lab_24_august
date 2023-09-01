package thursday_lab_24_aug;

import java.util.Scanner;

public class Perimeter {
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		Perimeter obj=new Perimeter();	//creating object
		//calling method with diff diff parameter
obj.perimeter(0);
obj.perimeter(0, 0);
obj.perimeter(0, 0, 0);
	}
//create method(method overloading)	
public void perimeter(int side) {
	
	int s;
	System.out.println("enter side");
	s=sc.nextInt();
	//applying formula
	int p=4*s;
	System.out.println("the perimeter of square is:"+p);
}

//create method(method overloading)	
public void perimeter(int lengh,int breath) {
	//intillized variable
	int l,b;
	System.out.println("enter lengh value and breath value");
	l=sc.nextInt();
	b=sc.nextInt();
	//applying formula
	int p=2*(l+b);
	System.out.println("the perimeter of rectangle is:"+p);
}



//create method(method overloading)	
public void perimeter(int a,double pi,int radius) {
	//intillized variable
	double pi1=3.14;
	int r;
	System.out.println("enter radius");
	r=sc.nextInt();
	//applying formula
	double p=2*pi1*r;
	System.out.println("the perimeter of circle is:"+p);
}



}
