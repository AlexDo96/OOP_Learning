package Lesson_08;

import java.security.SecureRandom;

public class Eagle extends Animal {
    private final double speed = new SecureRandom().nextInt(80);

    @Override
    protected String name() {
        return "Thunder";
    }

    @Override
    protected String simpleName() {
        return "The Eagle";
    }

    @Override
    protected double speed() {
        return speed;
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
