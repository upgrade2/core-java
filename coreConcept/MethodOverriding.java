package coreConcept;

class A {
    void display() {
        System.out.println("Parent class.");
    }
}

class Child extends A {
    void display() {
        System.out.println("coreConcept.Child class.");
    }

    void show() {
        // Call the display method of the Parent class
        super.display();
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();  // This will call the display method of the Parent class
    }
}
