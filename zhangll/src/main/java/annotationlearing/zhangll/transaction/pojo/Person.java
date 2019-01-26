package annotationlearing.zhangll.transaction.pojo;

public class Person {

    private String username;
    private int money;

    public Person() {
    }

    public Person(String username, int money) {
        this.username = username;
        this.money = money;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getMoney() {
        return this.money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person username(String username) {
        this.username = username;
        return this;
    }

    public Person money(int money) {
        this.money = money;
        return this;
    }

    @Override
    public String toString() {
        return "{" + " username='" + getUsername() + "'" + ", money='" + getMoney() + "'" + "}";
    }

}