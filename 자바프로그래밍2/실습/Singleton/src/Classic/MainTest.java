package Classic;

import java.time.Duration;
import java.time.Instant;

public class MainTest {
	static final int numThread = 5;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant startTime = Instant.now();
		Thread array[] = new Thread[numThread];
		
		for (int i = 0; i < numThread; i++) {
			array[i] = new Thread(new Runnable() {
				public void run() {
					Singleton inst = Singleton.getInstance();
					inst.print();
					System.out.println(Integer.toHexString(System.identityHashCode(inst)));
				}
			});
			array[i].start();
		}
		
		for(Thread t : array) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Instant endTime = Instant.now();	
		long elapseTime = Duration.between(startTime, endTime).toMillis();
		System.out.println(elapseTime + "ms");
	}

}
