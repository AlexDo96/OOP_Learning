package Lab9_1;

import java.security.SecureRandom;

public class Elephant extends Animal {
    private static final double MIN_LEG_HEIGHT = 3.0;
    private static final double MAX_LEG_HEIGHT = 4.0;

    private final double legHeight;
    private final int numberNo = new SecureRandom().nextInt(100);

    public Elephant() {
        raceBehavior = new RacingAnimal();
        legHeight = MIN_LEG_HEIGHT + (Math.random() * (MAX_LEG_HEIGHT - MIN_LEG_HEIGHT));
    }

    @Override
    protected double currentSpeed(){
        return legHeight * 6;
    }

    @Override
    protected String simpleName() {
        return "The Elephant " + numberNo;
    }
}
