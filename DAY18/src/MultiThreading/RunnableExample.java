package MultiThreading;

class Chrome implements Runnable
{
	public void run()
	{
		System.out.println("Chrome id "+Thread.currentThread().getId());
	}
}
class VSCode implements Runnable
{
	public void run()
	{
		System.out.println("VSCode id "+Thread.currentThread().getId());
	}
	
}
class Facebook implements Runnable
{
	public void run()
	{
		System.out.println("Facebook id "+Thread.currentThread().getId());
	}
	
}
public class RunnableExample {
	public static void main(String[] args)
	{
		
    Chrome ob=new Chrome ();
    Thread t=new Thread (ob);
    t.start ();
    
    VSCode ob1=new VSCode ();
    Thread t1=new Thread (ob1);
    t1.start();
    
    Facebook ob2=new Facebook ();
    Thread t2=new Thread (ob2);
    t2.start();
	}

}

