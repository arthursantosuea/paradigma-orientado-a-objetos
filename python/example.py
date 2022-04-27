class Person:
    """define a constructor methord that returns a Person object"""
    def __init__(self, name, age):
        self.name = name
        self.age = age
    """define a method that returns a message with properties of Person object"""
    def message_name(self):
        print("Hello my name is " + self.name + " and I'm " + str(self.age) + " years old")

jhon = Person("John", 36)

"""change age through the object jhon"""
jhon.age = 37

"""call a method through the object jhon"""
jhon.message_name()