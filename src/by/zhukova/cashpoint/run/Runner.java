package by.zhukova.cashpoint.run;

import by.zhukova.cashpoint.entity.Cashpoint;
import by.zhukova.cashpoint.entity.Customer;

public class Runner {

	public static void main(String[] args) {
		
		Cashpoint cp = new Cashpoint();

		for (int i=0; i<15; i++) {
			Thread t = new Customer(cp);
			t.start();
			
			
		}
		
	}

}
