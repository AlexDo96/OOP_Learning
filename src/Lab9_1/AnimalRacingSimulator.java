package Lab9_1;

import java.util.ArrayList;
import java.util.List;

public class AnimalRacingSimulator {
    public static void main(String[] args) {
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

        RacingController controller = new RacingController();
        controller.animalsRacing(animalList);
    }
}
