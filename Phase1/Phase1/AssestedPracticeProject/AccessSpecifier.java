package Phase1.AssestedPracticeProject;

public class AccessSpecifier {
	
	public static void main(String[] args) {
		//default
		System.out.println("Default Access Specifier : ");
		DefualtAccessSpecifier obj = new DefualtAccessSpecifier(); 		  
      obj.display(); 
     
     obj.displayprotected();
     obj.displaypublic();

	}

}
