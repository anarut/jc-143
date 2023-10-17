package lesson10;

public class NewDoubleAccount {

    private String id;
    private String owner;
    private double amount;

    public NewDoubleAccount(String id, String owner, double amount) {
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
