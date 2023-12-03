package HW_04;

public class Account {
    // region Поля
    private String userName;
    private String userLastName;
    private String userPassword;
    private double accountBalance;
    // endregion

    public Account(String userName, String userLastName, String userPassword, double accountBalance) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userPassword = userPassword;
        try {
            if (accountBalance < 0) {
                throw new IllegalArgumentException("Введите положительный баланс");
            }

            this.accountBalance = accountBalance;
            System.out.printf("Начальный баланс пользователя %s %s - %.2f\n", getUserName(), getUserLastName(), getAccountBalance());
        } catch (IllegalArgumentException e) {
            System.out.printf("Попытка создать счет с отрицательным начальным балансом у пользователя %s %s - %.2f\n", getUserName(), getUserLastName(), e.getMessage());
        }
    }


    public void deposit(double quantity) {
        try {
            if (quantity <= 0) {
                throw new IllegalArgumentException("cумма депозита должна быть положительной.");
            }
            setAccountBalance(getAccountBalance() + quantity);
            System.out.printf("Баланс пользователя %s %s успешно пололнен на сумму в размере %.2f, баланс: %.2f\n", getUserName(), getUserLastName(), quantity, getAccountBalance());
        } catch (IllegalArgumentException e) {
            System.out.printf("Попытка внести депозит с отрицательной суммой у пользователя %s %s: %s \n", getUserName(), getUserLastName(), e.getMessage());
        }
    }

    public void cashWithdrawal(double withdrawAmount) throws InsufficientFundsException {
        if (accountBalance - withdrawAmount < 0) {
            throw new InsufficientFundsException("Недостаточно средств на счету", accountBalance, withdrawAmount);
        }
        this.accountBalance -= withdrawAmount;
        System.out.printf("Со счета пользователя %s %s успешно сняты средства в размере %.2f, баланс %.2f\n", getUserName(), getUserLastName(), withdrawAmount, getAccountBalance());
    }
    // region Свойства
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserLastName() {
        return userLastName;
    }
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    // endregion

}