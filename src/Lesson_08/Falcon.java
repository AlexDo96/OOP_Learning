package Lesson_08;

import java.security.SecureRandom;

public class Falcon extends Animal {
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
        return new SecureRandom().nextInt(70);
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
