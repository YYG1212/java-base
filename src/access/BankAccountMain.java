package access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(3000);
        account.withdraw(4000);
        System.out.println("balance = " + account.getBalance());
    }
}
