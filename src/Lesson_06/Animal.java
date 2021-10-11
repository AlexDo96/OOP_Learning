package Lesson_06;

public class Animal {
    private String name;
    protected static String defaultName; // Class variable

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Class method | Before the instance created
    public static String getDefaultName() {
        if (defaultName == null) {
            return "Animal Default Name";
        }
        return defaultName;
    }

    protected int speed() {
        int randomSpeed = 0;
        return randomSpeed;
    }
}
