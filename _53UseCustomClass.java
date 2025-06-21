import ObjectOriented.Person;

public class _53UseCustomClass {
     public static void main(String[] args) {

        Person Jack = new Person();
        //Jack.name = "Jack Lee";
        Jack.setName("Jack Lee");
        //Jack.age = 25;  //無法直接存取age屬性，因為age是private的
        //Jack.gender = true;  //無法直接存取gender屬性，因為age是private的

        Jack.introduce(); // 呼叫Jack的introduce方法

     }
}
