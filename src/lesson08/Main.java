package lesson08;

import lesson03.GuessNumber;
import lesson07.animal.Animal;
import lesson07.animal.Cat;
import lesson07.animal.Dog;
import lesson07.animal.Eagle;
import lesson07.animal.EarthAnimal;
import lesson07.animal.Fish;
import lesson07.animal.FlyingAnimal;
import lesson07.animal.GoldFish;
import lesson07.animal.Human;
import lesson07.animal.Parrot;
import lesson07.animal.Shark;

public class Main {

    public static void main(String[] args) {
        final Cat cat = new Cat(3, "Kitty", 3.2, true);
        Dog dog = new Dog(5, "Snoopy", 5.6, false);
        Eagle eagle = new Eagle(6, "Killy", 12.2, true);
        GoldFish goldFish = new GoldFish(1, "Goldy", 0.3, false);
        Parrot parrot = new Parrot(2, "Leroy", 1, true);
        Shark shark = new Shark(4, "Baby", 20, true);
        Human human = new Human(23, "Valera", 78.2, true);
        Dog dog2 = new Dog(7, "Bonny", 3.6, true);
        EarthAnimal dog3 = new Dog(17, "Bonny1", 8.3, true);
        Animal dog4 = new Dog(8, "Bonny2", 7.6, true);
        Object dogX = new Dog(5, "Bonny3", 9.5, true);

        Animal[] animals = {cat, dog, eagle,
                goldFish, parrot, shark, human,
                dog2, dog3, dog4, (Animal) dogX};

        for (Animal obj : animals) {
            obj.eat();

            boolean b = obj instanceof EarthAnimal;
            if (obj instanceof EarthAnimal) {
                EarthAnimal earthAnimal = (EarthAnimal) obj;
                earthAnimal.run();
            }

            if (obj instanceof FlyingAnimal flyingAnimal) {
                flyingAnimal.fly();
            }
            if (obj instanceof Fish fish) {
                fish.swim();
            }
        }


        Robot robot = new Robot();
        Robot robot1 = new Robot();

        Runnable[] runnables = {human, dog, robot, cat, dog2, robot1, dog3};

        for (Runnable r : runnables) {
            r.run();
        }

        dog2.setAge(- 123123);
        dog2.setName("Stiven");


        final  int a = 14;

//        a = 15;

        GuessNumber.test(44);
    }
}
