import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		Person p1=new Person("Sam", 21, "Prime minister");
		Person p2=new Person("Ross", 21, "Teacher");
		Person p3=new Person("Barry", 21, "Gamer");
		Person p4=new Person("Jacky", 21, "Developer");
		Person p5=new Person("Tolu", 21, "Engineer");
		ArrayList<Person> arr=new ArrayList<>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
		arr.add(p4);
		arr.add(p5);
		for (Person i : arr) {
			System.out.println(i);
		}
		try {
			String content=Person.StringTransformation(arr);
			File file=new File("C:/Users/Admin/Desktop/Test.txt");
			FileWriter fw=new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
			
		try {
		File file=new File("C:/Users/Admin/Desktop/Test.txt");
		BufferedReader br=new BufferedReader(new FileReader(file));
		List<String> lines = new ArrayList<String>();
		String line=br.readLine();
		while (line!=null) {
			lines.add(line.replace(">",""));
			line=br.readLine();
		}
		for (String i:lines) {
			System.out.println(i);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
		
}
