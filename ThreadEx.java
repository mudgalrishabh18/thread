//this is an example of thread using in java.
package threads;
class thread1 extends Thread{
	public void run1() {
		System.out.println("Keep name of first thread here....");
	}
}
	


class thread2 extends Thread{
	public void run2() {
		System.out.println("Keep name of second thread here....");
	}
	
}

public class ThreadEx {

	public static void main(String[] args) {
		thread1 obj1=new thread1();
		thread2 obj2=new thread2();
		 obj1.start();
		 obj2.start();
		 
		 

	        obj1.setName("My First Thread");        //Giving a name to the thread
	        obj2.setName("My Second Thread");
	 
	        String name1 = obj1.getName();    //Retreiveing the name of the thread
	        String name2 = obj2.getName(); 
	
	        System.out.println(name1);
	        System.out.println(name2);

	}

}
