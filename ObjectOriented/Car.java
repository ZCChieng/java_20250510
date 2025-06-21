//1.2建構子與方法
package ObjectOriented;

public class Car {
    String brand;
    int year;

    // 預設的建構子 constructor 會是空的，當你沒有定義任何建構子時，可以不用寫(Java會自動提供一個預設的建構子)。
    public Car() {
    }

    // 你可以定義自己的建構子，來初始化物件的屬性。
    // 建構子是一種特殊的方法，可使用多載來處理不同的初始化需求。
    public Car(String brand) {
        this.brand = brand;
        this.year = 2025; // 假設預設年份為2021
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.year = 2020;
        car.displayInfo();

        Car car2 = new Car("Honda");
        car2.displayInfo();

        Car car3 = new Car(2023);
        car3.brand = "Ford";
        car3.displayInfo();

        Car car4 = new Car("BMW", 2024);
        car4.displayInfo();

        Car car5 = new Car("Nissan", 2024);
        car5.year = 2025; // 修改年份
        car5.displayInfo();


        BankAccount account = new BankAccount(1000);
        //account.balance = 2000; // 這行會報錯，因為 balance 是 private 的
        account.balance2 = 2000; // 這行可以正常執行，因為 balance2 是 package-private 的

        System.out.println("銀行餘客:"+account.getBalance()); 

        account.deposit(500); // 存款500
    }
}
