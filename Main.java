class Transaction{
    private int customerId;
    private int tellerId;
    public Transaction(int customerId, int tellerId){
        this.customerId = customerId;
        this.tellerId = tellerId;
    }
    public int getCustomerId(){
        return customerId;
    }
    public int getTellerId(){
        return tellerId;
    }
    public String getTransactionDescription(){
        return "";
    }
}
class Deposit extends Transaction{
    private int amount;
    public Deposit(int customerId, int tellerId, int amount){
        super(customerId, tellerId);
        this.amount = amount;
    }
    @Override
    public String getTransactionDescription(){
        return "Teller "+getTellerId()+" deposited "+amount+" to account "+getCustomerId();
    }
}
class Withdraw extends Transaction{
    private int amount;
    public Withdraw(int customerId, int tellerId, int amount){
        super(customerId, tellerId);
        this.amount = amount;
    }
    @Override
    public String getTransactionDescription(){
        return "Teller "+getTellerId()+" withdrew "+amount+" from account "+getCustomerId();
    }
}
class OpenAccount extends Transaction{
    public OpenAccount(int customerId, int tellerId){
        super(customerId, tellerId);
    }
    @Override
    public String getTransactionDescription(){
        return "Teller "+getTellerId()+"opened account "+getCustomerId();
    }
}
