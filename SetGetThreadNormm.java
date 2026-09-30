class MyThread extends Thread{
	public void run(){
		System.out.println("Thread is running with name:" + Thread.currentThread().getName());
		System.out.println("Thread priority: " + Thread.currentThread().getPriority());
	}
}

public class SetGetThreadNormm{
	public static void main(String [] args){
		Thread myThread = new Thread(new MyThread());
		myThread.setName("MyThreadNM");
		myThread.setPriority(Thread.NORM_PRIORITY);
		myThread.start();
		System.out.println("Main thread name:" + Thread.currentThread().getName());
		System.out.println("main thread priority "+ Thread.currentThread().getPriority());
	}
}	