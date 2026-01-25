class Main{
    public static void main(String args[]){
        BankSystem bankSystem = new BankSystem(new ArrayList<BankAccount>(), new ArrayList<Transaction>());
        Bank bank = new Bank(new ArrayList<BankBranch>(), bankSystem, 10000);

        BankBranch branch1 = bank.addBranch("2480 S Walnut Rd", 1000);
        BankBranch branch2 = bank.addBranch("145 Fort Harrison Rd", 1000);

        branch1.addTeller(new BankTeller(1));
        branch1.addTeller(new BankTeller(2));
        branch2.addTeller(new BankTeller(3));
        branch2.addTeller(new BankTeller(4));

        int customerId1 = branch1.openAccount("Vasudeva");
        int customerId2 = branch1.openAccount("Krishna");
        int customerId3 = branch2.openAccount("Mahesh");

        branch1.deposit(customerId1, 500);
        branch1.deposit(customerId2, 500);
        branch2.deposit(customerId3, 100);

        branch1.withdraw(customerId1, 30);

        bank.printTransactions();

        bank.collectCash(0.5);
    }
}