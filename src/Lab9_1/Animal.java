package Lab9_1;

public abstract class Animal {
    IRaceBehavior raceBehavior;

    protected abstract double currentSpeed();

    protected abstract String simpleName();

    protected int winCount = 0;

    public int getWinCount() {
        return winCount;
    }

    public void setWinCount(int winCount) {
        this.winCount = winCount;
    }

    protected boolean isRaceApplicable() {
        return raceBehavior.raceAble();
    }
}
