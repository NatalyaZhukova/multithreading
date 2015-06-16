package by.zhukova.cashpoint.entity;

import java.util.concurrent.locks.ReentrantLock;

public class Customer extends Thread {
	private final ReentrantLock locker = new ReentrantLock();
	Cashpoint cp;
	
	public Customer(Cashpoint cp) {
		this.cp = cp;
	}
	public void run() {
		System.out.println("Обслуживаюсь в кассе");
		
		locker.lock();
		try {
			System.out.println(locker.getQueueLength());
					sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			locker.unlock();
		}
		
	
		
	}
}
