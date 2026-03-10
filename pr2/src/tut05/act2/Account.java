package tut05.act2;

public class Account {
	private Long id;
	private String accountHolderName;
	private double accountBalance;

	public Account(Long id, String accountHolderName, double accountBalance) {

		if (accountHolderName == null || accountHolderName.isEmpty()) {
			throw new RuntimeException("Tài khoản không hợp lệ");
		}
		if (accountBalance < 0) {
			throw new RuntimeException("Số dư tài khoản không hợp lệ");
		}
		if (id == null) {
			throw new RuntimeException("ID tài khoản không hợp lệ");
		}

		this.id = id;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void deposit(double amount) {
		if (amount <= 0) {
			throw new RuntimeException("Số tiền gửi phải lớn hơn 0");
		}

		System.out.println("Giao dịch: Nạp " + amount + " vào tài khoản của " + getAccountHolderName());
		accountBalance += amount;
		System.out.println(
				"Giao dịch thành công: " + amount + " đã được nạp vào tài khoản của " + getAccountHolderName());
		System.out.println("Giao dịch thành công. Số dư mới: " + accountBalance);
	}

	public void withdraw(double amount) {
		if (amount > accountBalance) {
			throw new IllegalStateException("Số dư không đủ");
		}
		System.out.println("Giao dịch: Rút " + amount + " vào tài khoản của " + getAccountHolderName());
		accountBalance -= amount;
		System.out.println(
				"Giao dịch thành công: " + amount + " đã được rút ra khỏi tài khoản của " + getAccountHolderName());
		System.out.println("Giao dịch thành công. Số dư mới: " + accountBalance);
	}
}
