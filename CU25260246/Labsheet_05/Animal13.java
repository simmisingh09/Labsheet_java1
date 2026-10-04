// Q13. Animal Sound Overriding
class Animal13 {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog13 extends Animal13 {
    @Override
    void makeSound() {
        System.out.println("Dog is barking.");
    }
}

class Cat13 extends Animal13 {
    @Override
    void makeSound() {
        System.out.println("Cat is meowing.");
    }

    public static void main(String[] args) {
        Dog13 d = new Dog13();
        Cat13 c = new Cat13();

        d.makeSound();
        c.makeSound();
    }
}
