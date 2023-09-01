package thursday_lab_24_aug;
//extend a class
public class Nurse extends doctor {
	//create a method with same (method overriding)
	public void intro() {
	System.out.println("\n\nenter your name");
	name=sc.next();
	System.out.println("hello i am nurse "+ name+".");
	}
	//create method
	public void assist() {
		System.out.println("nurse "+name+" is assisting a doctor.");
	}

}
