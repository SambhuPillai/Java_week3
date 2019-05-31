import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PopulatingArray {
	public static void array() {
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
			System.out.println(i);;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
