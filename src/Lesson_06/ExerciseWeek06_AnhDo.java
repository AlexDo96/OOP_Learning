package Lesson_06;

import java.util.ArrayList;
import java.util.List;

public class ExerciseWeek06_AnhDo {
    public static void animalRacing(List<Animal> animalList) {
        int max = 0;
        int index = 0;

        for (Animal animal : animalList) {
            if (max < animal.speed()) {
                max = animal.speed();
                index++;
            }
        }

        String animalName = animalList.get(index - 1).getName();
        String simpleName = animalList.get(index - 1).getClass().getSimpleName();

        System.out.println("Winner is: " + animalName + ", with speed: " + max + " km/h");
        System.out.println("Simple name of winner animal is: " + simpleName);
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Husky");
        Horse horse = new Horse("Pony");
        Tiger tiger = new Tiger("Simba");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);

        ExerciseWeek06_AnhDo.animalRacing(animalList);
    }
}
