class Person
    def initialize(name, age)
        @name = name
        @age = age
    end
    def name
        @name
    end
    def age
        @age
    end
    def name=(name)
        @name = name
    end
    def age=(age)
        @age = age
    end

    def message
        puts "#{@name} is #{@age} years old."
    end
end
person = Person.new("John", 25)
person.message
person.name = "Jane"
person.age = 26
person.message