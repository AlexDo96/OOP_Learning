package Lesson_08;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacing {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal eagle = new Eagle();
        Animal falcon = new Falcon();
        Animal horse = new Horse();
        Animal squirrel = new Squirrel();
        Animal tiger = new Tiger();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(eagle);
        animalList.add(falcon);
        animalList.add(horse);
        animalList.add(squirrel);
        animalList.add(tiger);

        Controller controller = new Controller();
        controller.animalsRacing(animalList);
    }
}
