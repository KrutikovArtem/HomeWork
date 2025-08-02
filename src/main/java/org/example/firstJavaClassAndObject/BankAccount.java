package org.example.firstJavaClassAndObject;

public class BankAccount {
    String owner;
    int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void deposit(int many) {
        int newBalance = this.balance + many;
        this.balance = newBalance;
    }

    public void withdraw(int many) {
        int newBalance = this.balance - many;
        this.balance = newBalance;
    }

    public void printBalance(){
        System.out.println("На аккаунте " + this.owner + " Такой баланс " + this.balance);
    }
}
