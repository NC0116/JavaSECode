package com.neusoft;

public class DynamicTest {
    public static void main(String[] args) {
        //多态形式
        //父类类型 对象名 = new 子类对象
//        Animal dog = new Dog();
//        dog.eat();
//        Animal cat = new Cat();
//        cat.eat();

        //多态的好处
        Dog dog = new Dog();
        Cat cat = new Cat();
        //调用showCatEat
//        showCatEat(cat);
//
//        showDogEat(dog);

        showAnimalEat(cat);
        showAnimalEat(dog);
    }

//    public static void showDogEat(Dog dog) {
//        dog.eat();
//    }
//
//    public static void showCatEat(Cat cat) {
//        cat.eat();
//    }
//Cat在喵喵吃猫粮
////Dog在哐哐造狗粮
    public static void showAnimalEat(Animal animal) {
        animal.eat();
    }
}

//结果:
//Cat在喵喵吃猫粮
//Dog在哐哐造狗粮