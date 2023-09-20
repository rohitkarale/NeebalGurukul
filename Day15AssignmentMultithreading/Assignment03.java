package neebalsgurukul.day15;

public class Assignment03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread2 thread1=new MyThread2("Thread 1");
		MyThread2 thread2=new MyThread2("Thread 2");	
		
		thread1.start();
		thread2.start();
		
		if(thread1.isAlive()) {
			System.out.println(thread1.getName()+"is Running!!!");
		}
		else {
			System.out.println(thread1.getName()+"is Not Running!!!");
		}
		
		if(thread1.isAlive()) {
			System.out.println(thread2.getName()+"is Running !!!");
		}
		else {
			System.out.println(thread2.getName()+"is Not Running!!!");
		}
	}

}
class MyThread2 extends Thread{
	public MyThread2(String name){
		super(name);
	}
	@Override
	public void run() {
		System.out.println(getName()+"is Running!!!");
	}
}