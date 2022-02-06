package Phase1.AssestedPracticeProject;

public class DiamondProblem implements First, Second  {
	

    public void show() 
    {  
        First.super.show(); 
        Second.super.show(); 
    } 
    public static void main(String args[]) 
    { 
    	DiamondProblem  ob = new DiamondProblem(); 
        ob.show(); 
    } 


}
