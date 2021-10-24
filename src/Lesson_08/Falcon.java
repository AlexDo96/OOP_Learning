package Lesson_08;

import java.security.SecureRandom;

public class Falcon extends Animal {
    private final double speed = new SecureRandom().nextInt(70);

    @Override
    protected String name() {
        return "Electric";
    }

    @Override
    protected String simpleName() {
        return "The Falcon";
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
