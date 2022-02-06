package Phase1.AssestedPracticeProject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
		 ArrayList<String> arr = new ArrayList<String>(Arrays.asList("ketu@gmail.com", "sanskruti@gmail.com", "bhagi@gmail.com", "jyo@gmail.com"));
		
		 try{
			 Scanner sc = new Scanner(System.in);
			 System.out.println("Enter the Email Id you want to search : ");
			 String s= sc.next("[a-z]+[@][a-z]+.com");
		 
			 if(arr.contains(s))
			 {
				 System.out.println(s+" is present inside the list ");
			 }
			 else
			 {
				 System.out.println(s+" is not present inside the list ");
			 }
		 
		 	}catch(Exception e){
		 		System.out.println("Please enter valid Email Id");
		 }

	}


}
