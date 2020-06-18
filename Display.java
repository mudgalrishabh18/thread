//Create two threads, one thread to display all even numbers between 1 & 20, another to display odd numbers between 1 & 20.
//Note: Display all even numbers followed by odd numbers
//Hint: use join

package threads;

//contains odd number
class Thread1 extends Thread{
	public void odd() {
		for(int i=1;i<=20;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
	
	
}


//contains even number
class Thread2 extends Thread{
	public void even() {
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}
	
}

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.odd();
		t2.even();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
