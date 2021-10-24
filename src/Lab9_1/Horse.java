package Lab9_1;

import java.security.SecureRandom;

public class Horse extends Animal {
    private static final double MIN_SPEED = 2.0;
    private static final double MAX_SPEED = 5.0;

    private final double actualSpeed;
    private final int numberNo = new SecureRandom().nextInt(100);

    public Horse() {
        raceBehavior = new RacingAnimal();
        actualSpeed = MIN_SPEED + (Math.random() * (MAX_SPEED - MIN_SPEED));
    }

    @Override
    protected double currentSpeed() {
        return actualSpeed;
    }

    @Override
    protected String simpleName() {
        return "The Horse " + numberNo;
    }
}
