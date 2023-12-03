package HW_04;
/**     Создать программу управления банковским счетом (Account).

 Программа должна позволять пользователю вводить начальный баланс счета,
 сумму депозита и сумму снятия средств.
 При этом она должна обрабатывать следующие исключительные ситуации:

 Попытка создать счет с отрицательным начальным балансом
 должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
 Попытка внести депозит с отрицательной суммой
 должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
 Попытка снять средства, сумма которых превышает текущий баланс,
 должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.

 Продемонстрируйте работу вашего приложения:
 Программа должна обрабатывать все исключения с помощью конструкции try-catch,
 выводя соответствующие сообщения об ошибках.
 */

public class Main {
    public static void main(String[] args) {
        try {
            Account account1 = new Account("Евгений", "Сидоров", "120pp", 256);
            Account account2 = new Account("Ольга", "Иванова", "85696", 500);
            Account account3 = new Account("Василий", "Уткин", "123456", 0);
            account1.deposit(500);
            account2.deposit(-100);
            account3.deposit(100);

            account1.cashWithdrawal(50);
            account2.cashWithdrawal(200);
            account3.cashWithdrawal(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
        catch (InsufficientFundsException e) {
            System.out.printf("%s\nБаланс:%s, сумма снятия:%s, недостаток:%s\n",
                    e.getMessage(),
                    e.getAccountBalance(),
                    e.getWithdrawAmount(),
                    e.lackMoney()
            );
        }
    }
}
