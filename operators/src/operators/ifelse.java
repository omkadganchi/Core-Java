package operators;

public class ifelse {

	public static void main(String[] args) {
		int age=18 ;
		System.out.println("The age is: "+age);
if(age<13 && age>0) {
	System.out.println("Children");
} else if (age>=13 && age<18){
	System.out.println("Teenager");
} else if  (age>=18 && age<65 ) {
	System.out.println("Adult");
} else {
	System.out.println("Senior");
}
	}

}
