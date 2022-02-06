package Phase1.AssestedPracticeProject;

public class ExceptionHandling1  {
	
	   String str1;
	   ExceptionHandling1(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1 extends Main{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			
			throw new Exception("This is My error Message");
		}
		catch(Exception exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
