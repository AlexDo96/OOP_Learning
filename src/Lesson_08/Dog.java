package Lesson_08;

import java.security.SecureRandom;

public class Dog extends Animal {
    private final double speed = new SecureRandom().nextInt(60);

    @Override
    protected String name() {
        return "Shiba";
    }

    @Override
    protected String simpleName() {
        return "The Dog";
    }

    @Override
    protected double speed() {
        return speed;
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
