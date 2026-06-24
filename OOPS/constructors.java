public class constructors {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Rahul";
        s1.age = 18;

    }
}

class Students{
    String name;
    int age;
}

class Car {
    String name;
    int modle;

    // default constructor

    Car(String name, int modle) {
        this.name = name;
        this.modle = modle;
    }
}

class employee{
    String name;
    int id;
    int age;

    // parameterized constructor.

    employee(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}

class rectangle{
    int length;
    int breadth;

    void area() {
        System.out.println(length*breadth);
    }
}

class BankAccount{
    String accountHolder;
    int accountNumber;
    String branch;

    // constructor overloading.

    BankAccount() {
        this.accountHolder = "unknown";
        accountNumber = 0;
        branch = "unknown";
    }
    BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
        accountNumber = 0;
        branch = "unknown";
    }
    BankAccount(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        branch = "unknown";
    }
    BankAccount(String accountHolder, int accountNumber, String branch) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.branch = branch;
    }
}
class Mobile{
    String company;
    int cost;
    String owner;

    // constructor chaining.

    Mobile(){
        this("unknown");
    }
    Mobile(String company) {
        this(company, -1);
    }
    Mobile(String company, int cost) {
        this(company, cost, "unknown");
    }
    Mobile(String company, int cost, String owner) {
        this.company = company;
        this.cost = cost;
        this.owner = owner;
    }
}
