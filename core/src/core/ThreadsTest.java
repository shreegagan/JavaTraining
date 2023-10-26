package core;

public class ThreadsTest {
	public static class PrinterThread extends Thread{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
			//super.run();
		}
	}
	public  static class PrinterThreadIntf implements Runnable{
		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread()+" "+i);
				
			}
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		new PrinterThread().start();
//		new PrinterThread().start();
		new Thread(new PrinterThreadIntf()).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		}).start();
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread()+" "+i);
		}
		

	}

}
