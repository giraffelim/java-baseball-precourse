package baseball.domain;

public enum CompareResult {
    STRIKE,
    BALL,
    NOTHING;

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }
}
