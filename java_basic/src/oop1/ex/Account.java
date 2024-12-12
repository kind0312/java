package oop1.ex;

public class Account {
	int balance;//잔액

	 void deposit(int amount) {
		balance += amount;
	}
	
	void withdraw(int amount) {
		boolean result = balance >= amount;
		if(result) {
			balance -= amount;
		}else {
			System.out.println("잔액 부족");
		}
	}
}
