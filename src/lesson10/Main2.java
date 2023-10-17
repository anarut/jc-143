package lesson10;

import java.math.BigInteger;

public class Main2 {

    public static void main(String[] args) {
        Account batman = new Account(12312321, "Batman", 100000000);
        Account superman = new Account(123124235, "Superman", 15);

        DoubleAccount doubleAccount = new DoubleAccount(23423423, "Marta", 244.55);
        DoubleAccount doubleAccount1 = new DoubleAccount(1231231, "Fry", 0.22);

        NewDoubleAccount newDoubleAccount = new NewDoubleAccount("W2123", "Peter", 333.3);

        GenericAccount<String, Integer> account =
                new GenericAccount<>("BY12312312", "Ivan", 12312312);

        String id = account.getId();
        Integer amount = account.getAmount();

        GenericAccount<Integer, Double> account2 =
                new GenericAccount<>(1231253511, "Ivan", 123112.3);
        Integer id1 = account2.getId();
        Double amount1 = account2.getAmount();

        GenericAccount<String, BigInteger> account3 =
                new GenericAccount<>("1231253511", "Ivan", new BigInteger("123213412312312"));
        String id2 = account3.getId();
        BigInteger amount2 = account3.getAmount();


        Integer a = Integer.valueOf(4);
        Integer b = 4;
        int c = b;
        Integer d = null;
        int g = d;
    }
}
