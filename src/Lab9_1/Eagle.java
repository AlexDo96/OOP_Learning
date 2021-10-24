package Lab9_1;

import java.security.SecureRandom;

public class Eagle extends Animal {
    private static final double MIN_WING_LENGTH = 0.5;
    private static final double MAX_WING_LENGTH = 1.2;

    private final double wingLength;
    private final int numberNo = new SecureRandom().nextInt(100);

    public Eagle() {
        raceBehavior = new UnRacingAnimal();
        wingLength = MIN_WING_LENGTH + (Math.random() * (MAX_WING_LENGTH - MIN_WING_LENGTH));
    }

    @Override
    protected double currentSpeed() {
        return wingLength * 4;
    }

    @Override
    protected String simpleName() {
        return "The Eagle " + numberNo;
    }
}
