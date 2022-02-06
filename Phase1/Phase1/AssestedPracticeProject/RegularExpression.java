package Phase1.AssestedPracticeProject;
import java.util.regex.Pattern;

public class RegularExpression {
	
	public static void main(String[] args) {
		System.out.println ("ketakirtanpure@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","ketakirtanpure@gmail.com"));
		System.out.println ("atharvtanpure@gmail.com : "+Pattern.matches("[a-z]+[@][a-z]+.[a-z]+","atharvtanpure@gmail.com"));
		System.out.println ("test123prepare@co.edu.com : "+Pattern.matches("[a-z]+\\d{3}+[a-z]+[@][a-z]+.[a-z]+.[a-z]+","test123prepare@co.edu.com"));
		System.out.println ("9067168485 : "+Pattern.matches("\\d{10}","9619145671"));
		System.out.println ("ketutanpure@99 : "+Pattern.matches("[SWA][a-z]+\\d{3}+[a-z0-9]+","ketutanpure@99"));
		
	}


}
