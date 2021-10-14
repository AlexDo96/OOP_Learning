package Lesson_07.Exercise_7_1;

public class Animal {
    //Private Final Attributes
    private final String name;
    private final String simpleName;
    private final boolean flyAble;
    private final int speed;

    //Private Constructor
    private Animal(Builder builder) {
        this.name = builder.name;
        this.simpleName = builder.simpleName;
        this.flyAble = builder.flyAble;
        this.speed = builder.speed;
    }

    //Service Methods
    public String getName() {
        return this.name;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public boolean isFlyAble() {
        return this.flyAble;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void joinTheRace() {
        if (this.runOnTheGround()) {
            System.out.printf("The %s with name %s join this race.\n", this.simpleName, this.name);
        } else {
            System.out.printf("The %s with name %s not qualified this race.\n", this.simpleName, this.name);
        }
    }

    //Support Methods
    private boolean runOnTheGround() {
        if (!this.flyAble) {
            return true;
        }
        return false;
    }

    //Inner Static Class
    public static class Builder {
        private String name;
        private String simpleName;
        private boolean flyAble;
        private int speed;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder simpleName(String simpleName) {
            this.simpleName = simpleName;
            return this;
        }

        public Builder flyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Animal build() {
            return new Animal(this);
        }
    }
}
