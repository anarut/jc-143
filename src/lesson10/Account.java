package lesson10;

public class Account {

    private int id;
    private String owner;
    private int amount;

    public Account(int id, String owner, int amount) {
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
