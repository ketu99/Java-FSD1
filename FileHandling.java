package JavaBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {


	public static void main(String[] args) {
//		Create and write to a file
		PrintWriter writer;
		try {
			writer = new PrintWriter(new File("C:\\Users\\Shree\\some.txt"));
			writer.println("Hello...Welcome!!");
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("C:\\Users\\Shree\\Some issues : " + e.getMessage());
		}
		
		
//		File reading logic
		
		
		StringBuilder builder = new StringBuilder("");

		try {
			String data = "";
			
			 BufferedReader reader = new BufferedReader(new FileReader(new File("C:\\Users\\Shree\\some.txt")));
			
			while((data = reader.readLine())!= null) {
				builder.append(data + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("C:\\Users\\Shree\\Some issues : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Data in the file :");
		
		System.out.println(builder);
		
		//rreader.close();

		
		
	}

}






	

