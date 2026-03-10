package tut05.act2;

public class TestMain {
    public static void main(String[] args) {

        // 1. Tạo account hợp lệ
        Account acc1 = new Account(1L, "Alice", 1_000_000);
        Account acc2 = new Account(2L, "Bob", 500_000);

        // 2. Hiển thị số dư ban đầu
        System.out.println("=== TRẠNG THÁI BAN ĐẦU ===");
        System.out.println("Alice: " + acc1.getAccountBalance());
        System.out.println("Bob  : " + acc2.getAccountBalance());

        // 3. Test giao dịch hợp lệ
        System.out.println("\n=== TEST GIAO DỊCH HỢP LỆ ===");
        Transaction t1 = new Transaction(acc1, acc2, 300_000);
        t1.execute();

        // 4. Verify sau giao dịch
        System.out.println("\n=== SAU GIAO DỊCH ===");
        System.out.println("Alice: " + acc1.getAccountBalance());
        System.out.println("Bob  : " + acc2.getAccountBalance());

        // 5. Test lỗi: chuyển quá số dư
        System.out.println("\n=== TEST THIẾU TIỀN ===");
        try {
            Transaction t2 = new Transaction(acc1, acc2, 5_000_000);
            t2.execute();
        } catch (RuntimeException e) {
            System.out.println("LỖI: " + e.getMessage());
        }

        // 6. Test lỗi: số tiền âm
        System.out.println("\n=== TEST SỐ TIỀN ÂM ===");
        try {
            Transaction t3 = new Transaction(acc1, acc2, -100);
            t3.execute();
        } catch (RuntimeException e) {
            System.out.println("LỖI: " + e.getMessage());
        }

        // 7. Test lỗi: chuyển cho chính mình
        System.out.println("\n=== TEST CHUYỂN CHO CHÍNH MÌNH ===");
        try {
            Transaction t4 = new Transaction(acc1, acc1, 100);
            t4.execute();
        } catch (RuntimeException e) {
            System.out.println("LỖI: " + e.getMessage());
        }
    }
}
