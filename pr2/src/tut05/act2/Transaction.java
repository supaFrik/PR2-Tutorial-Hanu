package tut05.act2;

public class Transaction {
	private Account from;
	private Account to;
	private double amount;

	public Transaction(Account from, Account to, double amount) {
		super();
		this.from = from;
		this.to = to;
		this.amount = amount;
	}

	public void execute() {
		validate();
		
		System.out.println("===== BẮT ĐẦU GIAO DỊCH =====");
		System.out.println("Số dư " + from.getAccountHolderName() + " (trước) : " + from.getAccountBalance());
		System.out.println("Số dư " + to.getAccountHolderName() + " (trước): " + to.getAccountBalance());
		System.out.println("Số tiền chuyển: " + amount);

		from.withdraw(amount);

		to.deposit(amount);

		System.out.println("GIAO DỊCH THÀNH CÔNG");
		System.out.println("Số dư người gửi (sau): " + from.getAccountBalance());
		System.out.println("Số dư người nhận (sau): " + to.getAccountBalance());
		System.out.println("===== KẾT THÚC GIAO DỊCH =====");
	}

	private void validate() {
		if (from == null || to == null) {
			throw new RuntimeException("Tài khoản gửi hoặc nhận không tồn tại");
		}

		if (from == to) {
			throw new RuntimeException("Không thể chuyển tiền cho chính mình");
		}

		if (amount <= 0) {
			throw new RuntimeException("Số tiền giao dịch phải lớn hơn 0");
		}
	}
}
