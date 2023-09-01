package thursday_lab_24_aug;
//main method
public class Main {

	public static void main(String[] args) {
		doctor obj=new doctor();  //obj created
		surgon obj1=new surgon();   //obj created
		Nurse obj2=new Nurse();     //obj created
		//calling methods through object
		obj.intro();
		obj1.intro();
		obj1.perfomance();
		obj2.intro();
		obj2.assist();

	}

}
