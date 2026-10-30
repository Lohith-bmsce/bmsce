
import transaction.Account;
import reports.TransactionReport;

public class Main {

    public static void main(String[] args) {

        // Create account object
        Account acc = new Account(1001, 5000);

        // Perform deposit
        acc.deposit(4000);

        // Perform withdrawal
        acc.withdraw(2000);

        // Generate transaction report
        TransactionReport report = new TransactionReport();

        report.generateReport(acc);
    }
}
