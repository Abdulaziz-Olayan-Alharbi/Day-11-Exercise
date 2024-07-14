package Day_11_exercise;

public class Account {



    private String id;
    private String name;
    private int balance = 0;
    public Account(String id , String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id , String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
    public int credit(int amount) {
        this.balance += amount;
        return this.balance;
    }
    public int debit(int amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            return this.balance;
        }else {
            return this.balance;
        }
    }
    public int transferTo (Account another, int amount) {
        if (this.balance - amount > 0) {
            this.balance -= amount;
            another.balance += amount;
            return this.balance;
        }else {
            return this.balance;
        }
    }


    public String toString() {
        return id + " , " + name + " , " + balance;
    }
}
