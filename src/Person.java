public class Person {
    public int age;
    public String name;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return name + " : " + age;
    }
}
