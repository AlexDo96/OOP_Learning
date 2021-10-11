package Lesson_06;

import java.security.SecureRandom;

public class Horse extends Animal {
    // Static block
    static {
        defaultName = "Horse Default Name";
    }

    public Horse() {
    }

    public Horse(String name) {
        super(name);
    }

    // Class method | Before the instance created
    // Cannot override static function from main class
    public static String getDefaultName() {
        if (defaultName == null) {
            return "Horse";
        }
        return defaultName;
    }

    @Override
    public int speed() {
        int horseSpeed = new SecureRandom().nextInt(75);
        return super.speed() + horseSpeed;
    }
}
