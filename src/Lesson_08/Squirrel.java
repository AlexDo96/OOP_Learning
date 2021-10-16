package Lesson_08;

import java.security.SecureRandom;

public class Squirrel extends Animal{
    @Override
    protected String name() {
        return "Dale";
    }

    @Override
    protected String simpleName() {
        return "The Squirrel";
    }

    @Override
    protected double speed() {
        return new SecureRandom().nextInt(45);
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
