//Create two threads and assign names ‘Scooby’ and ‘Shaggy’ to the two threads. Display both thread names. in java
package threads;



class MyThread extends Thread
{
    
   /** public void run()
    {
        System.out.println("Keep some task here....");
    }**/
}
 
public class ThreadsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   MyThread thread1 = new MyThread();     //Creating a thread
		   MyThread thread2=new MyThread();
		   
	        thread1.start();                     //Starting a thread
	        thread2.start();
	        
	 
	        thread1.setName("My First Thread");        //Giving a name to the thread
	        thread2.setName("My Second Thread");
	 
	        String name1 = thread1.getName();    //Retreiveing the name of the thread
	        String name2 = thread2.getName(); 
	
	        System.out.println(name1);
	        System.out.println(name2);

	}

}
