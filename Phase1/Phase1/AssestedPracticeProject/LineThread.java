package Phase1.AssestedPracticeProject;

public class LineThread {
	
	synchronized public void getLine()                     
	{
		
		for(int i=1;i<=3;i++)
		{
			try{
	    		Thread.sleep(2000);  
	    	}
	    catch(InterruptedException e)
	    {
	    	System.out.println(e);
	    }  
		System.out.println("running thread state is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getState());  // it will print state of the thread running
	    System.out.println("Thread Name : "+ Thread.currentThread().getName()+ " ::: "+ i);  
	    System.out.println("Is my thread alive or not? : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().isAlive());  // it will heck if thread is alive or dead
	    System.out.println("The thread id is : "+ Thread.currentThread().getName()+ " ::: " + Thread.currentThread().getId()); // CPU scheduler has given a unique ID to each thread
		}  
	
		}
	}


class Sync extends Thread
{
	
	LineThread line;

	Sync(LineThread line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}



	


