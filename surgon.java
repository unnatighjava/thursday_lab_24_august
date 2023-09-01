package thursday_lab_24_aug;
//extend a class
public class surgon extends doctor {

	String speclizing;
	//create a method with same (method overriding)
	public void intro() {
		System.out.println("\n\nenter your name");
		name=sc.next();
		System.out.println("enter your speclize");
		speclizing=sc.next();
		System.out.println("hello i am surgon "+name+" ,speciallizing in "+speclizing+".");
	}
	//create method
		public void perfomance() {
			System.out.println("performing surgun as a "+speclizing+" surgon"+".");			
		}
		
	}


