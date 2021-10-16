package Lesson_08;

import java.security.SecureRandom;

public class Eagle extends Animal {
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
        return new SecureRandom().nextInt(80);
    }

    @Override
    protected boolean flyAble() {
        return true;
    }
}
