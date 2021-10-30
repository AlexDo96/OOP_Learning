package Lab9_1;

public abstract class Animal {
    IRaceBehavior raceBehavior;

    protected abstract double currentSpeed();

    protected abstract String simpleName();

    protected boolean isRaceApplicable() {
        return raceBehavior.raceAble();
    }
}
