using System;
public class Person
{
    public string name;
    public int age;

    public string Name { get => name; set => name = value; }
    public int Age { get => age; set => age = value; }

    public Person(string name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void SayHello()
    {
        Console.WriteLine("Hello, my name is {0} and I am {1} years old.", name, age);
    }
    static void Main(string[] args)
    {
        Person person = new Person("John", 25);
        person.SayHello();
    }
}