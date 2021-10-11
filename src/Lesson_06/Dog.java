package Lesson_06;

import java.security.SecureRandom;

public class Dog extends Animal {
    // Static block
    static {
        defaultName = "Dog Default Name";
    }

    public Dog() {
    }

    public Dog(String name) {
        super(name);
    }

    // Class method | Before the instance created
    // Cannot override static function from main class
    public static String getDefaultName() {
        if (defaultName == null) {
            return "Dog";
        }
        return defaultName;
    }

    @Override
    public int speed() {
        int dogSpeed = new SecureRandom().nextInt(60);
        return super.speed() + dogSpeed;
    }
}
