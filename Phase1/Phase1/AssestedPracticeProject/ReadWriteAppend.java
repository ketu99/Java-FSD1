package Phase1.AssestedPracticeProject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadWriteAppend {
	
	public static void main(String[] args) {

		PrintWriter writer;
		try {
			writer = new PrintWriter(new File("C:\\Users\\Shree\\Some.txt"));
			writer.println("Hello World");
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("Some issues : " + e.getMessage());
		}
		
		
		
		StringBuilder builder = new StringBuilder("");

		try {
			String data = "";
			
			 BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Shree\\Some.txt")));
			
			while((data = reader.readLine())!= null) {
				builder.append(data + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("Some issues : " + e.getMessage());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Data in the file :");
		
		System.out.println(builder);
				
		
	}

}




