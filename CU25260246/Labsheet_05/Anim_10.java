// Q10. Animal -> Dog and Cat
class Anim_10 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog10 extends Anim_10  {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Cat10 extends Anim_10 {
    void meow() {
        System.out.println("Cat is meowing.");
    }

    public static void main(String[] args) {
        Dog10 d = new Dog10();
        Cat10 c = new Cat10();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
