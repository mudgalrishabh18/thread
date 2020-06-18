//Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds before printing 6
package threads;

class MyNumber implements Runnable
{
  public void run()
   {
     try
       {
        for(int i=1;i<=10;i++)
        {
          Thread.sleep(1000);         
          System.out.println(i);
          if(i==5) {
        	  Thread.sleep(5000);  
          }
        }
        }
       catch(InterruptedException e)
           {
             System.out.println("Exception..."+e);
           }
    }
}

public class Delay {

	public static void main(String[] args) {

	     MyNumber m1 = new MyNumber();
	   //  Thread thread = new Thread(m1);
	  //   thread.start();
	     
	     //other method to run......
	     m1.run();
		
		

	}

}
