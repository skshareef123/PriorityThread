package priorityThread;

public class thread {

	public static void main(String[] args) {
		Thread o=new Thread();
		Thread o1=Thread.currentThread();
		System.out.println(o.isAlive());
		System.out.println(o1.isAlive());
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);

	}

}
