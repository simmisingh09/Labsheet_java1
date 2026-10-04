// Q4. Animal -> Dog
class Animal4 {
    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Dog4 extends Animal4 {
    void bark() {
        System.out.println("Dog is barking.");
    }

    public static void main(String[] args) {
        Dog4 d = new Dog4();

        d.eat();
        d.sleep();
        d.bark();
    }
}
