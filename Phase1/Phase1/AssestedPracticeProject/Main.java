package Phase1.AssestedPracticeProject;

public class Main {

    public static void main(String args[]) 
    { 
        try
        { 
            throw new Exception("temp"); 
        } 
        catch (Exception ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    

	
	} 
}
