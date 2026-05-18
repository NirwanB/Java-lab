class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
}

class lab2 {
    public static void main(String[] args) {
        Dog a1 = new Dog();
        Cat a2 = new Cat();
        a1.sound();
        a2.sound();
    }
}