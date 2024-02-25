public class Account {
    private String Id;
    private String name;
    private int balance=0;

    Account(){

    }
    Account(String Id , String name){
     this.Id=Id;
     this.name=name;
    }

    Account(String Id, String name , int balance){
        this.Id=Id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int credit(int amount){
        if(balance < amount)
            balance=-1;
        else
            balance=balance-amount;

        return balance;
    }
    public int debit(int amount){
       balance=balance+amount;
       return balance;
    }
    public int transferTo(Account recieve,int amount){
        if(amount < 0){
            System.out.println("amount cannot be negative");
        }else if (balance < amount){
            System.out.println("not enough balance ");
        }
        balance=balance-amount;
        recieve.balance=recieve.balance+amount;
        return balance;
    }
    public String toString(){
        return getId()+getName()+getBalance();
    }


}
