package Phase1.AssestedPracticeProject;

public class DogOopsConcept {
	
	 String name; 
	    String breed; 
	    int age; 
	    String color; 
	    public DogOopsConcept(String name, String breed, int age, String color) 
	    { 
	        this.name = name; 
	        this.breed = breed; 
	        this.age = age; 
	        this.color = color; 
	    } 
	    public String getName() 
	    { 
	        return name; 
	    } 
	    public String getBreed() 
	    { 
	        return breed; 
	    } 
	    public int getAge() 
	    { 
	        return age; 
	    } 
	    public String getColor() 
	    { 
	        return color; 
	    } 
	    @Override
	    public String toString() 
	    { 
	        return("Hi my name is "+ this.getName()+ ".\nMy breed,age and color are " + this.getBreed()+", " + this.getAge()+ ", and "+ this.getColor() + "."); 
	    } 
	    public static void main(String[] args) 
	    { 
	        DogOopsConcept scott = new DogOopsConcept("Scott","papillon", 6, "brown"); 
	        System.out.println(scott.toString()); 
	    } 
	}




