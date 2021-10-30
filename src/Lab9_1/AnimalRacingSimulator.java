package Lab9_1;

import java.util.*;

public class AnimalRacingSimulator {
    public static void main(String[] args) {
        Map<String, Integer> racingRecords = new HashMap<>();
        int MAX_ROUND = 10;

        for (int roundNumber = 1; roundNumber <= MAX_ROUND; roundNumber++) {
            Animal eagle1 = new Eagle();
            Animal eagle2 = new Eagle();
            Animal elephant1 = new Elephant();
            Animal elephant2 = new Elephant();
            Animal horse1 = new Horse();
            Animal horse2 = new Horse();
            Animal tiger1 = new Tiger();
            Animal tiger2 = new Tiger();

            List<Animal> animalList = new ArrayList<>();
            animalList.add(eagle1);
            animalList.add(eagle2);
            animalList.add(elephant1);
            animalList.add(elephant2);
            animalList.add(horse1);
            animalList.add(horse2);
            animalList.add(tiger1);
            animalList.add(tiger2);

            // Get the winner
            RacingController controller = new RacingController();
            Animal winner = controller.animalsRacing(animalList);

            // Add into racingRecords
            racingRecords.put(winner.simpleName(), 1); //Consider this line
            int currentWinRound = racingRecords.get(winner.simpleName());
            racingRecords.replace(winner.simpleName(), currentWinRound++);
            System.out.println("Current win: " + currentWinRound);
        }

        Map.Entry<String, Integer> finalWinnerFamily = null;
        Iterator<Map.Entry<String, Integer>> racingRecordInterator = racingRecords.entrySet().iterator();
        while (racingRecordInterator.hasNext()) {
            Map.Entry<String, Integer> currentAnimalFamily = racingRecordInterator.next();
            if (finalWinnerFamily == null) {
                finalWinnerFamily = currentAnimalFamily;
            } else {
                Integer winCount = currentAnimalFamily.getValue();
                if (winCount > finalWinnerFamily.getValue()) {
                    finalWinnerFamily = currentAnimalFamily;
                }
            }
        }

        System.out.println("Final winner is: " + finalWinnerFamily.getKey());
        System.out.println("Win " + finalWinnerFamily.getValue() + " times");
    }
}
