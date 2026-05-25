class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("deposit amount must be positive");
        }
        balance += amount;
        System.out.println("deposited: " + amount);
    }

    public void withdraw(double amount) throws Exception {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawl must be greater then zero ");
        } else if (amount > balance) {
            throw new Exception("Insuffficient balance");
        } else {
            balance -= amount;
            System.out.println("withdraw: " + amount);
        }
    }
    public double GetBalance(){
        return balance;
    }
}

public class index{
    static void main(String[] args) {
        Account a = new Account();
        try{
            a.deposit(1000);
            a.withdraw(15000);
        }
        catch(IllegalArgumentException e){
            System.out.println("Input error"+ e.getMessage());
        }
        catch(Exception e){
            System.out.println("transaction error"+ e.getMessage());
        }
        finally{
            System.out.println("finall amount balance"+a.GetBalance());
        }
    }
}

