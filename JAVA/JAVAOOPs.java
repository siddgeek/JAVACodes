class Employee {                                           // Encapsulation
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}

// Inheritance
class Manager extends Employee {
    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

// Polymorphism
class Animal {
    public void sound() {
        System.out.println("Generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Meow!");
    }
}

// Abstraction
abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Composition
class University {
    private String name;
    private Department[] departments;

    public University(String name, Department[] departments) {
        this.name = name;
        this.departments = departments;
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }
}

class Department {
    private String name;
    private Professor[] professors;

    public Department(String name, Professor[] professors) {
        this.name = name;
        this.professors = professors;
    }

    public String getName() {
        return name;
    }

    public Professor[] getProfessors() {
        return professors;
    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class JAVAOOPs {
    public static void main(String[] args) {
        // Encapsulation
        Employee employee = new Employee("John Doe", 30);
        System.out.println(employee.getName());
        employee.setName("Siddharth");
        System.out.println(employee.getName());

        // Inheritance
        Manager manager = new Manager("John Doe", 30, "Marketing");
        System.out.println(manager.getName());
        System.out.println(manager.getDepartment());

        // Polymorphism
        Animal dog = new Dog();
        dog.sound();
        Animal cat = new Cat();
        cat.sound();

        // Abstraction
        Shape circle = new Circle(5);
        System.out.println(circle.area());
        Shape rectangle = new Rectangle(4, 5);
        System.out.println(rectangle.area());

        // Composition
        Professor[] professors = {new Professor("Satnam Singh"), new Professor("Siddharth")};
        Department department = new Department("Computer Science", professors);
        Department[] departments = {department};
        University university = new University("Chandigarh University", departments);
        System.out.println(university.getName());
        System.out.println(department.getName());
        System.out.println(professors[0].getName());
    }
}


