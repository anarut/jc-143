package lesson10;

public class DoubleAccount {

    private int id;
    private String owner;
    private double amount;

    public DoubleAccount(int id, String owner, double amount) {
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
