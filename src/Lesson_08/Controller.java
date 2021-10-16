package Lesson_08;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public void animalsRacing(List<Animal> animals) {
        List<Animal> listRacing = applicableAnimals(animals);
        Animal winner = null;

        for (Animal currentAnimal : listRacing) {
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.speed() < currentAnimal.speed()) {
                    winner = currentAnimal;
                }
            }
        }

        System.out.println("----------------------- Start the race -----------------------");
        for (Animal currentAnimal : listRacing) {
            System.out.println(currentAnimal.name() + " is running .......");
        }
        System.out.println("----------------------- End the race -------------------------");
        System.out.println("Winner name: " + winner.name() + " " + winner.simpleName());
        System.out.println("Winner's speed was: " + winner.speed() + "km/h");
    }

    private List<Animal> applicableAnimals(List<Animal> animals) {
        List<Animal> appicableAnimals = new ArrayList<>();

        for (Animal currentAnimal : animals) {
            if (!currentAnimal.flyAble()) {
                appicableAnimals.add(currentAnimal);
            }
        }

        System.out.println("List of animals can join the race: ");
        for (Animal currentAnimal : appicableAnimals) {
            System.out.println(currentAnimal.name() + " " + currentAnimal.simpleName());
        }

        return appicableAnimals;
    }
}
