package thursday_lab_24_aug;
import java.util.Scanner;


class doctor {
	String name;
	Scanner sc=new Scanner(System.in);
	//create method
public void intro() {
	
	System.out.println("enter name:");
	name=sc.next();
	System.out.println("hello i am doctor "+name);
}


}


