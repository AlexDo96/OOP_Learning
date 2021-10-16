package Lesson_08;

import java.security.SecureRandom;

public class Tiger extends Animal{
    @Override
    protected String name() {
        return "Simba";
    }

    @Override
    protected String simpleName() {
        return "The Tiger";
    }

    @Override
    protected double speed() {
        return new SecureRandom().nextInt(100);
    }

    @Override
    protected boolean flyAble() {
        return false;
    }
}
