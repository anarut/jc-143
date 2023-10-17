package lesson10;

import java.nio.file.Files;

public class GenericAccount<T, K extends Number> {

    private T id;
    private String owner;
    private K amount;

    public GenericAccount(T id, String owner, K amount) {
        Class<?> aClass = id.getClass();
        if (!(id instanceof Double || aClass.equals(Float.class))) {
            //
        }
        this.id = id;
        this.owner = owner;
        this.amount = amount;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public K getAmount() {
        return amount;
    }

    public void setAmount(K amount) {
        this.amount = amount;
    }

    public <L> L todo(L test) {
        return test;
    }
}
