package access;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		account.deposit(10000);
		account.withdraw(3000);
		System.out.println("balance = " + account.getBalance());
		
		//데이터(필드)는 private으로 전부다 숨기고, 기능(메서드)도 필요한 것만 public으로 보이게 하고 나머지는 private으로 숨기자
	}
}
