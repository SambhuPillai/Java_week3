import java.util.ArrayList;
import java.util.Scanner;

public class Person {
	String name;
	int age;
	String occupation;
	Person(String name, int age, String occupation) {
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	@Override
	public String toString() {
		return name+", "+age+", "+occupation;
	}
	public static String StringTransformation(ArrayList<Person> arr) {
		String s= "";
		
		for (Person i: arr) {
			s+=" "+i.toString();
			
		}
		return s;
	}

}
