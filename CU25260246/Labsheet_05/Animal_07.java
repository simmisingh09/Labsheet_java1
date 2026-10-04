public class Animal_07 {
    
}
// Q7. Animal -> Dog -> Puppy
class Animal7 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog7 extends Animal7 {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy7 extends Dog7 {
    void play() {
        System.out.println("Puppy is playing.");
    }

    public static void main(String[] args) {
        Puppy7 p = new Puppy7();

        p.eat();
        p.bark();
        p.play();
    }
}
