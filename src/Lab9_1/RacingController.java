package Lab9_1;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public void animalsRacing(List<Animal> animals) {
        double raceDistance = 10000.0;
        double raceTotal = 0.0;
        int winnerCount;

        List<Animal> listRacing = applicableAnimals(animals);
        Animal roundWinner = null;
        List<Animal> listWinner = new ArrayList<>();
        Animal lastWinner = null;

        for (Animal currentAnimal : listRacing) {
            if (roundWinner == null) {
                roundWinner = currentAnimal;
            } else {
                while (raceTotal <= raceDistance) {
                    if (roundWinner.currentSpeed() < currentAnimal.currentSpeed()) {
                        raceTotal = raceTotal + currentAnimal.currentSpeed();
                        System.out.println("Total race: " + raceTotal + " m");
                    }
                }
                roundWinner = currentAnimal;

                winnerCount = roundWinner.getWinCount() + 1;
                roundWinner.setWinCount(winnerCount);
                listWinner.add(roundWinner);
            }
        }

        for (Animal winnerAnimal : listWinner) {
            if (lastWinner == null) {
                lastWinner = winnerAnimal;
            } else {
                if (lastWinner.getWinCount() < winnerAnimal.getWinCount()) {
                    lastWinner = winnerAnimal;
                }
            }
        }

        System.out.println("----------------------- Start the race -----------------------");
        for (Animal currentAnimal : listRacing) {
            System.out.println(currentAnimal.simpleName() + " is running .......");
        }
        System.out.println("----------------------- End the race -------------------------");
        System.out.println("Final winner is: " + lastWinner.simpleName());
        System.out.println("Final winner's speed was: " + lastWinner.currentSpeed() + " m/s");
        System.out.println("Final winner's rounds win: " + lastWinner.getWinCount() + " rounds");
    }

    private List<Animal> applicableAnimals(List<Animal> animals) {
        List<Animal> appicableAnimals = new ArrayList<>();

        for (Animal currentAnimal : animals) {
            if (currentAnimal.isRaceApplicable()) {
                appicableAnimals.add(currentAnimal);
            }
        }

        System.out.println("List of animals can join the race: ");
        for (Animal currentAnimal : appicableAnimals) {
            System.out.println(currentAnimal.simpleName());
        }

        return appicableAnimals;
    }
}
