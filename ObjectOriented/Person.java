//1. 物件與類別
//1.1類別與物件的概念

package ObjectOriented;

// 類別（Class）是物件的藍圖或Template，定義了物件的特徵(屬性)和功能(方法)。
// 台灣人有什麼特徵？美國人有什麼特徵？日本人有什麼特徵？
// 台灣人、美國人、日本人都是人類。
// 這些人類都有姓名、年齡、性別等特徵(屬性)。

public class Person {
    // field（屬性）
    String name; // 姓名
    int age; // 年齡
    boolean gender; // 性別，true表示男性，false表示女性

    // 功能(方法)
    public void introduce() {
        System.out.println("大家好，我是" + name + "，今年" + age + "歲，性別是" + (gender ? "男性" : "女性") + "。");
    }

    // 利用方法的結構來實現屬性封裝
    public void setName(String name) {
        this.name = name; // 使用 this 關鍵字來區分成員變數和參數
    }

    /*
     * public String getName() {
     *      return this.name; // 返回姓名
     * }
     */

    // 這是一個程式進入點，當你執行這個程式時，會從這裡開始執行。
    public static void main(String[] args) {
        // 建立一個Person物件
        Person Jack = new Person();
        Person Mary = new Person();
        Person John = new Person();

        Jack.name = "Jack Lee";
        Jack.age = 25;
        Jack.gender = true; // 男性

        Mary.name = "Mary Chen";
        Mary.age = 22;
        Mary.gender = false; // 女性

        John.name = "John Smith";
        John.age = 30;
        John.gender = true; // 男性

        Jack.introduce(); // 呼叫Jack的introduce方法
        Mary.introduce(); // 呼叫Mary的introduce方法
        John.introduce(); // 呼叫John的introduce方法

        /*
         * System.out.println("姓名: " + Jack.name + ", 年齡: " + Jack.age + ", 性別: " +
         * (Jack.gender ? "男性" : "女性"));
         * System.out.println("姓名: " + Mary.name + ", 年齡: " + Mary.age + ", 性別: " +
         * (Mary.gender ? "男性" : "女性"));
         * System.out.println("姓名: " + John.name + ", 年齡: " + John.age + ", 性別: " +
         * (John.gender ? "男性" : "女性"));
         */

    }

}
