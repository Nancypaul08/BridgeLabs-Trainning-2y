package Exception_Handling;

class ATM {
    private int balance = 10000; // initial balance

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Error: Insufficient Balance! Available Balance: ₹" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful! Remaining Balance: ₹" + balance);
        }
    }
}

