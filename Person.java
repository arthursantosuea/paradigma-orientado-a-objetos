public class Person {
    String name;
    int age;

    // constructor method
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getter and setter methods
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void message() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    // main method
    public static void main(String[] args) {
        // instance of Person class
        Person person = new Person("John", 25);
        // calling the message method
        person.message();
    }
}

