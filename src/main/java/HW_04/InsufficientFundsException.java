package HW_04;
public class InsufficientFundsException extends Exception {
    private final double accountBalance;
    private final double withdrawAmount;

    public InsufficientFundsException(String message, double accountBalance, double withdrawAmount) {
        super(message);
        this.accountBalance = accountBalance;
        this.withdrawAmount = withdrawAmount;
    }
    public double lackMoney() {
        return withdrawAmount - accountBalance;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}