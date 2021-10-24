package Lesson_08;

import java.security.SecureRandom;

public class Horse extends Animal {
    private final double speed = new SecureRandom().nextInt(75);

    @Override
    protected String name() {
        return "Pony";
    }

    @Override
    protected String simpleName() {
        return "The Horse";
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
