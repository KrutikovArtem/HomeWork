package org.example;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    String getOwner() {
        return this.owner;
    }

    void deposit(int many) {
        int newBalance = this.balance + many;
        this.balance = newBalance;
    }

    void withdraw(int many) {
        int newBalance = this.balance - many;
        this.balance = newBalance;
    }

    void printBalance(){
        System.out.println("На аккаунте " + this.owner + " Такой баланс " + this.balance);
    }
}
