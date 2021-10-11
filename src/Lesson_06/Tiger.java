package Lesson_06;

import java.security.SecureRandom;

public class Tiger extends Animal {
    // Static block
    static {
        defaultName = "Tiger Default Name";
    }

    public Tiger() {
    }

    public Tiger(String name) {
        super(name);
    }

    // Class method | Before the instance created
    // Cannot override static function from main class
    public static String getDefaultName() {
        if (defaultName == null) {
            return "Tiger";
        }
        return defaultName;
    }

    @Override
    public int speed() {
        int tigerSpeed = new SecureRandom().nextInt(100);
        return super.speed() + tigerSpeed;
    }
}
