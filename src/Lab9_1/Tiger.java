package Lab9_1;

import java.security.SecureRandom;

public class Tiger extends Animal {
    private static final double MIN_WEIGHT = 250.0;
    private static final double MAX_WEIGHT = 400.0;

    private final double weight;
    private final int numberNo = new SecureRandom().nextInt(100);

    public Tiger() {
        raceBehavior = new RacingAnimal();
        weight = MIN_WEIGHT + (Math.random() * (MAX_WEIGHT - MIN_WEIGHT));
    }

    @Override
    protected double currentSpeed() {
        return weight * 0.06;
    }

    @Override
    protected String simpleName() {
        return "The Tiger " + numberNo;
    }
}
