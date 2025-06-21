//1.4 封裝與存取修飾詞  BankAccount.java
//目的:限制對類別成員的存取權限，保護資料不被隨意修改。
//封裝（Encapsulation）是物件導向程式設計的核心概念之一，它將資料和操作資料的方法封裝在一起，並限制對這些成員的存取權限。
package ObjectOriented;

public class BankAccount {
    // 如果欄位（field）沒有明確指定存取修飾詞，則預設的存取修飾詞是 package-private,同一個 package 中的類別可以存取。
    double balance2; // package-private
    private double balance; // 私有的變數，只有這個類別可以存取。

    
    // Constructor
    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("初始餘額不能為負數");
        }

        this.balance = initialBalance;
    }

    // 透過方法來存取balance
    public double getBalance() {
        return balance; // 提供一個方法來取得餘額
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("存款金額必須大於零");
        }
        balance += amount; // 增加餘額
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.balance = 2000;

        System.out.println("初始餘額: " + account.balance);
    }
}


    // 注意: 在 Java 中，類別成員的存取修飾詞有四種：public、protected、private 和 package-private（預設）。
    // public: 任何地方都可以存取。
    // protected: 同一個 package 中的類別和子類別可以存取。
    // private: 只有這個類別可以存取。
    // package-private: 同一個 package 中的類別可以存取（預設）。
