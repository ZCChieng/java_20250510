//1.3 this 關鍵字
package ObjectOriented;

public class Employee {
    String name;
    int age;

    // Constructor
    public Employee(String name) {
        this.name = name; // 使用 this 關鍵字來區分成員變數和參數

    }

    // 方法
    public void display() {
        System.out.println("員工姓名: " + name);
    }

    public void display2() {
        System.out.println("員工姓名: " + this.name);
    }

    public void setName(String name) {
        this.name = name; // 使用 this 關鍵字來區分成員變數和參數
    }

    public void setAge(int age) {

        if (age < 0) {
            System.out.println("年齡不能為負數");
            this.age = 0; // 設定為預設值
        } else {
            this.age = age; // 使用 this 關鍵字來區分成員變數和參數
        }

    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice");
        emp.display(); // 呼叫 display 方法
        emp.display2(); // 呼叫 display2 方法，有使用 this 關鍵字
        emp.name = "Bob"; // 直接修改成員變數 name 來修改員工姓名
        emp.setName("Bob"); // 使用 setName 方法修改員工姓名
        emp.display(); // 再次呼叫 display 方法，顯示修改後的姓名
        System.out.println("員工姓名: " + emp.name);

        emp.age = -30;
        System.out.println("員工年齡: " + emp.age);
        emp.setAge(-30); // 使用 setAge 方法來設定年齡
        System.out.println("員工年齡: " + emp.age);
    }
}
