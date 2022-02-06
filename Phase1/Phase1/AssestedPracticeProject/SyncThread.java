package Phase1.AssestedPracticeProject;

public class SyncThread {

	
	public static void main(String[] args) {
		
		LineThread obj = new LineThread();

	
		Sync train1 = new Sync(obj);
		Sync train2 = new Sync(obj);
		Sync train3= new Sync(obj);
		
		train1.setName("IT");
		train2.setName("HR");
		train3.setName("Finance");
		
		train1.start();
		train2.start();
		train3.start();
		
	}
}
