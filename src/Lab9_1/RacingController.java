package Lab9_1;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public Animal animalsRacing(List<Animal> animals) {
        List<Animal> listRacing = applicableAnimals(animals);
        Animal winner = null;

        for (Animal currentAnimal : listRacing) {
            if (winner == null) {
                winner = currentAnimal;
            } else {
                if (winner.currentSpeed() < currentAnimal.currentSpeed()) {
                    winner = currentAnimal;
                }
            }
        }

        return winner;
    }

    private List<Animal> applicableAnimals(List<Animal> animals) {
        List<Animal> appicableAnimals = new ArrayList<>();
        for (Animal currentAnimal : animals) {
            if (currentAnimal.isRaceApplicable()) {
                appicableAnimals.add(currentAnimal);
            }
        }

        return appicableAnimals;
    }
}
