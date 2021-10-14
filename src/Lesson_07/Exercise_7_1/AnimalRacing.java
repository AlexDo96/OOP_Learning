package Lesson_07.Exercise_7_1;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    //Controller
    public static Animal getMaxSpeed(List<Animal> animals) {
        Animal winner = null;

        for (Animal currentAnimal : animals) {
            if (!currentAnimal.isFlyAble()) {
                if (winner == null) {
                    winner = currentAnimal;
                } else {
                    if (winner.getSpeed() < currentAnimal.getSpeed()) {
                        winner = currentAnimal;
                    }
                }
            }
        }

        return winner;
    }

    public static void main(String[] args) {
        // Immutable Object
        Animal dog = new Animal.Builder()
                .simpleName("Dog")
                .name("Shiba")
                .flyAble(false)
                .speed(new SecureRandom().nextInt(60))
                .build();

        Animal horse = new Animal.Builder()
                .simpleName("Horse")
                .name("Pony")
                .flyAble(false)
                .speed(new SecureRandom().nextInt(75))
                .build();

        Animal tiger = new Animal.Builder()
                .simpleName("Tiger")
                .name("Simba")
                .flyAble(false)
                .speed(new SecureRandom().nextInt(100))
                .build();

        Animal goose = new Animal.Builder()
                .simpleName("Goose")
                .name("Donald")
                .flyAble(true)
                .speed(new SecureRandom().nextInt(30))
                .build();

        Animal eagle = new Animal.Builder()
                .simpleName("Eagle")
                .name("Vector")
                .flyAble(true)
                .speed(new SecureRandom().nextInt(70))
                .build();

        Animal falcon = new Animal.Builder()
                .simpleName("Falcon")
                .name("Thaco")
                .flyAble(true)
                .speed(new SecureRandom().nextInt(80))
                .build();

        dog.joinTheRace();
        horse.joinTheRace();
        tiger.joinTheRace();
        goose.joinTheRace();
        eagle.joinTheRace();
        falcon.joinTheRace();

        System.out.println("\n------------------------Start Racing------------------------");
        Animal winner = AnimalRacing.getMaxSpeed(Arrays.asList(dog, horse, tiger, goose, eagle, falcon));
        System.out.println("Winner name: " + winner.getName() + " the " + winner.getSimpleName());
        System.out.println("Winner's speed was: " + winner.getSpeed() + "km/h");
    }
}
