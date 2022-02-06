package Phase1.AssestedPracticeProject;

public class InnerClassOopsConcept {

	public static void main(String[] args) {

        // create object of Outer class CPU
        CPUOopsConcept cpu = new CPUOopsConcept();

       // create an object of inner class Processor using outer class
        CPUOopsConcept.Processor processor = cpu.new Processor();

        System.out.println("Processor Cache = " + processor.getCache());
     
    }
}
