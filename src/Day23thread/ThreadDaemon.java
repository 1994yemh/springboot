package Day23thread;

public class ThreadDaemon extends Thread {
	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			System.out.println(getName() + ":" + x);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
